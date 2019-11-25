package Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class createDatabase extends SQLiteOpenHelper {
    public static String TB_NHANVIEN ="NHANVIEN";
    public static String TB_MONAN ="MONAN";
    public static String TB_LOAIMONAN ="NHANVIEN";
    public static String TB_BANAN ="BANAN";
    public static String TB_GOIMON="GOIMON";
    public static String TB_CHITIETGOIMON ="NHANVIEN";


    public createDatabase(@Nullable Context context) {
        super(context,"OderFood",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
