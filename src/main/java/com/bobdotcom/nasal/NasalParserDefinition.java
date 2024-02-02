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

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.bobdotcom.nasal.parser.NasalParser;
import com.bobdotcom.nasal.psi.NasalFile;
import com.bobdotcom.nasal.psi.NasalTokenSets;
import com.bobdotcom.nasal.psi.NasalTypes;
import org.jetbrains.annotations.NotNull;

final class NasalParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(NasalLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new NasalLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return NasalTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new NasalParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new NasalFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return NasalTypes.Factory.createElement(node);
    }

}
