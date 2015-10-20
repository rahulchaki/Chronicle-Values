/*
 *      Copyright (C) 2015  higherfrequencytrading.com
 *
 *      This program is free software: you can redistribute it and/or modify
 *      it under the terms of the GNU Lesser General Public License as published by
 *      the Free Software Foundation, either version 3 of the License.
 *
 *      This program is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU Lesser General Public License for more details.
 *
 *      You should have received a copy of the GNU Lesser General Public License
 *      along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.openhft.chronicle.values;

final class Primitives {

    private Primitives() {}

    static boolean isPrimitiveIntegerType(Class type) {
        return type == byte.class || type == short.class || type == char.class ||
                type == int.class || type == long.class;
    }

    static boolean isPrimitiveFloatingType(Class type) {
        return type == float.class || type == double.class;
    }

    static int widthInBits(Class type) {
        if (type == boolean.class)
            return 1;
        if (type == byte.class)
            return 8;
        if (type == char.class || type == short.class)
            return 16;
        if (type == int.class || type == float.class)
            return 32;
        if (type == long.class || type == double.class)
            return 64;
        throw new AssertionError(type + " is not a primitive type");
    }
}
