/*
 * Token.java 03/12/2009 Copyright (C) 2009 Leonardo Alves da Costa This program is free software: you can redistribute
 * it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version. This program is distributed in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU General Public License for more details. You should have received a copy of the GNU
 * General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.googlecode.paradox.parser;

/**
 * Stores a token.
 *
 * @author Leonardo Alves da Costa
 * @version 1.0
 * @since 1.0
 */
public final class Token {
    
    /**
     * The token type.
     */
    private final TokenType type;
    
    /**
     * The token value.
     */
    private final String value;
    
    /**
     * Creates a new instance.
     *
     * @param type
     *            the token type.
     * @param value
     *            the token value.
     */
    Token(final TokenType type, final String value) {
        this.type = type;
        this.value = value;
    }
    
    /**
     * Gets the token type.
     *
     * @return the token type.
     */
    public TokenType getType() {
        return this.type;
    }
    
    /**
     * Gets the token value.
     *
     * @return the token value.
     */
    public String getValue() {
        return this.value;
    }
    
    /**
     * {@inheritDoc}.
     */
    @Override
    public String toString() {
        return this.type + " = " + this.value;
    }
    
    /**
     * Gets if this token is a conditional break.
     *
     * @return true if this token is a conditional break.
     */
    boolean isConditionBreak() {
        return TokenType.isConditionalBreak(this.type);
    }
    
    /**
     * Gets if this token is an operator.
     *
     * @return true if this token is an operator.
     */
    boolean isOperator() {
        return TokenType.isOperator(this.type);
    }
    
}
