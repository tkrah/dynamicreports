/**
 * DynamicReports - Free Java reporting library for creating reports dynamically
 *
 * Copyright (C) 2010 Ricardo Mariaca
 * http://dynamicreports.sourceforge.net
 *
 * This file is part of DynamicReports.
 *
 * DynamicReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DynamicReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with DynamicReports. If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.dynamicreports.design.base.crosstab;

import net.sf.dynamicreports.design.definition.crosstab.DRIDesignCrosstabCell;

/**
 * @author Ricardo Mariaca (dynamicreports@gmail.com)
 */
public class DRDesignCrosstabCell implements DRIDesignCrosstabCell {	
	private String name;	
	private Integer width;	
	private Integer height;	
	private String rowTotalGroup;	
	private String columnTotalGroup;	
	private DRDesignCrosstabCellContent content;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getWidth() {
		return width;
	}
	
	public void setWidth(Integer width) {
		this.width = width;
	}
	
	public Integer getHeight() {
		return height;
	}
	
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	public String getRowTotalGroup() {
		return rowTotalGroup;
	}
	
	public void setRowTotalGroup(String rowTotalGroup) {
		this.rowTotalGroup = rowTotalGroup;
	}
	
	public String getColumnTotalGroup() {
		return columnTotalGroup;
	}
	
	public void setColumnTotalGroup(String columnTotalGroup) {
		this.columnTotalGroup = columnTotalGroup;
	}
	
	public DRDesignCrosstabCellContent getContent() {
		return content;
	}
	
	public void setContent(DRDesignCrosstabCellContent content) {
		this.content = content;
	}
}
