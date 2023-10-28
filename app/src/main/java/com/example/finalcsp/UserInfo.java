package com.example.finalcsp;

import static java.security.AccessController.getContext;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public final class UserInfo
{
    private UserInfo(){}

    public static class UserEntry implements BaseColumns
    {
        public static final String TABLE_NAME = "user_info";
        public static final String FULL_NAME = "full_name";
        public static final String EMAIL = "email";

    }


}
