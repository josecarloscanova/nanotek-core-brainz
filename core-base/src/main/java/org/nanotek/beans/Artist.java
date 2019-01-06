package org.nanotek.beans;

import org.nanotek.Base;

/**
 * 
 * @author jose.carlos.canova@gmail.com
 * 
 * id                  SERIAL,
    gid                 UUID NOT NULL,
    name                VARCHAR NOT NULL,
    sort_name           VARCHAR NOT NULL,
    begin_date_year     SMALLINT,
    begin_date_month    SMALLINT,
    begin_date_day      SMALLINT,
    end_date_year       SMALLINT,
    end_date_month      SMALLINT,
    end_date_day        SMALLINT,
    type                INTEGER, -- references artist_type.id
    area                INTEGER, -- references area.id
    gender              INTEGER, -- references gender.id
    comment             VARCHAR(255) NOT NULL DEFAULT '',
    edits_pending       INTEGER NOT NULL DEFAULT 0 CHECK (edits_pending >= 0),
    last_updated        TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
    ended               BOOLEAN NOT NULL DEFAULT FALSE,
    begin_area          INTEGER, -- references area.id
    end_area            INTEGER -- references area.id
 *
 */
public class Artist implements Base<String> {

	String id; 
	String gid;
	String name; 
	String sortName;
	String beginDateYear;
	String beginDateMonth;
	String beginDateDay;
	String endDateYear; 
	String endDateMonth;
	String endDateDay; 
	String type; 
	String area; 
	String gender; 
	String comment; 
	String editsPending; 
	String lastUpdated; 
	String ended; 
	String beginArea;
	String endArea; 
	
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

}
