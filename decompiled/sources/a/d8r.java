package a;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final class d8r extends c8r implements ukn0 {
    public final SQLiteStatement c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8r(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        sQLiteStatement.getClass();
        this.c = sQLiteStatement;
    }

    public final void c() {
        this.c.execute();
    }
}
