/*
 * CarbonChat
 *
 * Copyright (c) 2023 Josua Parks (Vicarious)
 *                    Contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package net.draycia.carbon.common.users.db.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import net.draycia.carbon.common.util.Strings;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;
import org.jdbi.v3.core.mapper.ColumnMapper;
import org.jdbi.v3.core.statement.StatementContext;

public final class ComponentColumnMapper implements ColumnMapper<Component> {

    @Override
    public Component map(final ResultSet rs, final int columnNumber, final StatementContext ctx) throws SQLException {
        return GsonComponentSerializer.gson().deserializeOrNull(Strings.trim(rs.getString(columnNumber)));
    }

}
