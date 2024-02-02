/*
An IntelliJ IDEA language support plugin for Nasal.
Copyright (C) 2024  BobDotCom

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/
package com.bobdotcom.nasal;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.bobdotcom.nasal.psi.NasalTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class NasalSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey OPERATOR =
            createTextAttributesKey("NASAL_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("NASAL_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("NASAL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("NASAL_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("NASAL_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("NASAL_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("NASAL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    public static final TextAttributesKey BRACES =
            createTextAttributesKey("NASAL_BRACES", DefaultLanguageHighlighterColors.BRACES);

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] BRACES_KEYS = new TextAttributesKey[]{BRACES};

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new NasalLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
//        if (tokenType.equals(NasalTypes.OPERATOR)) {
//            return OPERATOR_KEYS;
//        }
        if (tokenType.equals(NasalTypes.IDENTIFIER)) {
            return IDENTIFIER_KEYS;
        }
        if (//tokenType.equals(NasalTypes.KEYWORD) ||
                tokenType.equals(NasalTypes.IF) ||
                tokenType.equals(NasalTypes.ELSE) ||
                tokenType.equals(NasalTypes.ELSIF) ||
                tokenType.equals(NasalTypes.FUNC) ||
                tokenType.equals(NasalTypes.RETURN) ||
                tokenType.equals(NasalTypes.FOR) ||
                tokenType.equals(NasalTypes.VAR) ||
                tokenType.equals(NasalTypes.WHILE) ||
                tokenType.equals(NasalTypes.FOREACH) ||
                tokenType.equals(NasalTypes.FORINDEX) ||
                tokenType.equals(NasalTypes.BREAK) ||
                tokenType.equals(NasalTypes.CONTINUE) ||
                tokenType.equals(NasalTypes.NIL)

        ) {
            return KEYWORD_KEYS;
        }
        if (tokenType.equals(NasalTypes.STRING)) {
            return STRING_KEYS;
        }
        if (tokenType.equals(NasalTypes.NUMBER)) {
            return NUMBER_KEYS;
        }
        if (tokenType.equals(NasalTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(NasalTypes.LBRACE) || tokenType.equals(NasalTypes.RBRACE)) {
            return BRACES_KEYS;
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }

}
