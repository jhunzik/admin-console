/**
 * Copyright (c) Codice Foundation
 * <p>
 * This is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or any later version.
 * <p>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details. A copy of the GNU Lesser General Public License
 * is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 **/
package org.codice.ddf.admin.beta.types;

import org.codice.ddf.admin.common.fields.base.scalar.StringField;

public class DateField extends StringField {

    public static final String FIELD_NAME = "date";

    public static final String FIELD_TYPE_NAME = "Date";

    public static final String DESCRIPTION = "A date according to ISO 8601. For example, 2017-06-01T18:17:44Z.";

    public DateField() {
        this(FIELD_NAME);
    }

    public DateField(String fieldName) {
        super(fieldName, FIELD_TYPE_NAME, DESCRIPTION);
    }
}