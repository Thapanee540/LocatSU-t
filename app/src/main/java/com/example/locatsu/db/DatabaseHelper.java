package com.example.locatsu.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.locatsu.R;


public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_name = "location.db";
    private static final int DATABASE_version = 1;

    public static final String TABLE_name = "location";
    public static final String COL_id = "_id";
    public static final String COL_name = "name";
    public static final String COL_picture = "picture";

    public static final String COL_detail = "detail";
    public static final String SQL_DATABASE_table = "create table "+ TABLE_name +"(" +
            COL_id +" integer primary key autoincrement, " +
            COL_name + " text," +
            COL_picture + " text," +
            COL_detail + " text" +
            ")";
    private Context mContext;

    public DatabaseHelper(Context context) {
        super(context,DATABASE_name,null,DATABASE_version);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_DATABASE_table);

    }

    private void insertInitialData(SQLiteDatabase db){
        ContentValues cv = new ContentValues();
        cv.put(COL_name, "Faculty of Science");
        cv.put(COL_picture, "p_faculty_sc_3.jpg");
        cv.put(COL_detail,mContext.getString(R.string.details_science));
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name, "Faculty of Architecture");
        cv.put(COL_picture,"p_f_architecture.jpg");
        cv.put(COL_detail, mContext.getString(R.string.details_architecture));
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name, "Faculty of Arts Council");
        cv.put(COL_picture, "p_f_arts_council.jpg");
        cv.put(COL_detail, mContext.getString(R.string.details_arts_council));
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name, " Faculty of Engineering and Industrial Technology ");
        cv.put(COL_picture, "p_f_engineer.jpg");
        cv.put(COL_detail, mContext.getString(R.string.details_engineering));
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name, "Faculty of Education");
        cv.put(COL_picture, "p_f_education.jpg");
        cv.put(COL_detail, mContext.getString(R.string.details_education));
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name, "Faculty of Painting, Sculpture and Graphic Arts");
        cv.put(COL_picture, "p_f_painting.jpg");
        cv.put(COL_detail,mContext.getString(R.string.details_painting) );
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name, " Faculty of Decorative Arts ");
        cv.put(COL_picture, "p_f_decorative_arts.jpg");
        cv.put(COL_detail,mContext.getString(R.string.details_decorative));
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name,"Faculty of Pharmacy");
        cv.put(COL_picture,"p_f_pharmacy.jpg");
        cv.put(COL_detail,mContext.getString(R.string.details_pharmacy));
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name, "Tennis Court");
        cv.put(COL_picture, "p_tennis.jpg");
        cv.put(COL_detail,mContext.getString(R.string.details_tennis));
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name, "Library");
        cv.put(COL_picture, "p_library.jpg");
        cv.put(COL_detail, mContext.getString(R.string.details_library));
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name, "The Demonstration School of Silpakorn University");
        cv.put(COL_picture, "p_satid_school.jpg");
        cv.put(COL_detail,mContext.getString(R.string.details_demonstration) );
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name, "The Demonstration School (Elementary age and Primary education)");
        cv.put(COL_picture, "p_primary_education.jpg");
        cv.put(COL_detail,mContext.getString(R.string.details_elementary) );
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name, "Futsal Court");
        cv.put(COL_picture, "p_futsal.jpg");
        cv.put(COL_detail, ,mContext.getString(R.string.details_futsal));
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name, "อาคารเพชรรัตน - สุวัทนา(โรงยิมใหม่)");
        cv.put(COL_picture, "p_gim.jpg");
        cv.put(COL_detail,mContext.getString(R.string.details_gim));
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name, "อนุสาวรีย์ศาสตราจารย์หม่อนหลวงปิ่นมาลากุล");
        cv.put(COL_picture, "p_model1.jpg");
        cv.put(COL_detail, mContext.getString(R.string.details_model1));
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name, "หอพักหญิงเพชรรัตน์ 1-7");
        cv.put(COL_picture, "p_girl_dormitory.jpg");
        cv.put(COL_detail, mContext.getString(R.string.details_girl));
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name, "หอพักชายทับแก้ว1");
        cv.put(COL_picture, "P_boy_dormitory1.jpg");
        cv.put(COL_detail, mContext.getString(R.string.details_boy1));
        db.insert(TABLE_name,null,cv);

        cv = new ContentValues();
        cv.put(COL_name, "หอพักชายทับแก้ว2");
        cv.put(COL_picture, "P_boy_dormitory2.jpg");
        cv.put(COL_detail, mContext.getString(R.string.details_boy2));
        db.insert(TABLE_name,null,cv);

//        cv = new ContentValues();
//        cv.put(COL_name, "หอพักชายทับแก้ว3");
//        cv.put(COL_picture, "P_boy_dormitory3.jpg");
//        cv.put(COL_detail,mContext.getString(R.string.details_boy3));
//        db.insert(TABLE_name,null,cv);


        cv = new ContentValues();
        cv.put(COL_name, "ตึกอธิการบดีมหาวิทยาลัยศิลปากร");
        cv.put(COL_picture, "P_chancellor.jpg");
        cv.put(COL_detail,mContext.getString(R.string.details_chancellor));
        db.insert(TABLE_name,null,cv);

//        cv = new ContentValues();
//        cv.put(COL_name, "สะพานสระแก้วมหาวิทยาลัยศิลปากร");
//        cv.put(COL_picture, "P_.jpg");
//        cv.put(COL_detail, mContext.getString(R.string.details_bridge));
//        db.insert(TABLE_name,null,cv);
//
//        cv = new ContentValues();
//        cv.put(COL_name, "Skating rink");
//        cv.put(COL_picture, "P_.jpg");
//        cv.put(COL_detail,mContext.getString(R.string.details_Skating));
//        db.insert(TABLE_name,null,cv);



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
// code for upgrading the database
    }
}
