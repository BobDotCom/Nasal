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
package com.bobdotcom.nasal.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.bobdotcom.nasal.NasalFileType;
import com.bobdotcom.nasal.NasalLanguage;
import org.jetbrains.annotations.NotNull;

public class NasalFile extends PsiFileBase {

    public NasalFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, NasalLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return NasalFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Nasal File";
    }

}

