package a;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class q13 implements spg0 {
    @Override // a.spg0
    public final qpg0 a(String str) {
        str.getClass();
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(str, (SQLiteDatabase.CursorFactory) null);
        sQLiteDatabaseOpenOrCreateDatabase.getClass();
        return new nkn0(new w7r(sQLiteDatabaseOpenOrCreateDatabase));
    }

    @Override // a.spg0
    public final boolean b() {
        return true;
    }
}
