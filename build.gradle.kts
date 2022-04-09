/*
 * This file is part of jLSPlant.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, see <https://www.gnu.org/licenses/>
 *
 * Copyright (C) 2022 T. Clément <https://github.com/tclement0922>
 */

plugins {
    id("com.android.application") apply false
    id("com.android.library") apply false
    id("org.jetbrains.kotlin.android") apply false
    id("org.jetbrains.dokka") apply false
}

val androidBuildToolsVersion by extra("32.0.0")
val androidCmakeVersion by extra("3.22.1") // Replace by installed cmake version (cmake --version)
val androidCompileSdkVersion by extra(32)
val androidMinSdkVersion by extra(21)
val androidNdkVersion by extra("23.1.7779620")
val androidTargetSdkVersion by extra(32)
val libArtifactId by extra("jlsplant")
val libGroupId by extra("dev.tclement.jlsplant")
val libIsSnapshot by extra(true)
val libVersionCode by extra(30001)
val libVersionName by extra("3.2-01")
