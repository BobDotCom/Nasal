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

import com.intellij.psi.tree.IElementType;
import com.bobdotcom.nasal.NasalLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class NasalTokenType extends IElementType {

    public NasalTokenType(@NotNull @NonNls String debugName) {
        super(debugName, NasalLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "NasalTokenType." + super.toString();
    }

}
