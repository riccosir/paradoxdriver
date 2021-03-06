/*
 * ParadoxIndex.java 03/14/2009 Copyright (C) 2009 Leonardo Alves da Costa This program is free software: you can
 * redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version. This program is distributed in
 * the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details. You should have received a
 * copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.googlecode.paradox.metadata;

import com.googlecode.paradox.ParadoxConnection;

import java.io.File;

/**
 * Stores index data.
 *
 * @author Leonardo Alves da Costa
 * @version 1.1
 * @since 1.0
 */
public final class ParadoxIndex extends ParadoxDataFile {

    /**
     * Field order ID.
     */
    private String sortOrderID;

    /**
     * Creates a new instance.
     *
     * @param file       the file to read of.
     * @param name       index name.
     * @param connection the database connection.
     */
    public ParadoxIndex(final File file, final String name, final ParadoxConnection connection) {
        super(file, name, connection);
    }

    /**
     * Gets the index order.
     *
     * @return the index order.
     */
    public String getOrder() {
        final int referential = this.getReferentialIntegrity();
        if ((referential == 0x10) || (referential == 0x11) || (referential == 0x30)) {
            return "D";
        }
        return "A";
    }

    public boolean isUnique() {
        final int referential = this.getReferentialIntegrity();
        return (referential == 0x20) || (referential == 0x21) || (referential == 0x30);
    }

    /**
     * Gets the sorter order id.
     *
     * @return the sorter order id.
     */
    public String getSortOrderID() {
        return this.sortOrderID;
    }

    /**
     * Sets the sort order ID.
     *
     * @param sortOrderID the sort order ID to set.
     */
    public void setSortOrderID(final String sortOrderID) {
        this.sortOrderID = sortOrderID;
    }
}
