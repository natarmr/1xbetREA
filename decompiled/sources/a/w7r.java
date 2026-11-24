package a;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class w7r implements Closeable {
    public static final String[] b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] c = new String[0];
    public static final a8z d;
    public static final a8z e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f38688a;

    static {
        wez wezVar = wez.f39042a;
        d = maz.a(wezVar, new v9q((byte) 26));
        e = maz.a(wezVar, new v9q((byte) 27));
    }

    public w7r(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        this.f38688a = sQLiteDatabase;
    }

    public final boolean P0() {
        return this.f38688a.inTransaction();
    }

    public final void a() {
        this.f38688a.beginTransaction();
    }

    public final void c() {
        this.f38688a.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f38688a.close();
    }

    public final void d() throws IllegalAccessException, InvocationTargetException {
        a8z a8zVar = e;
        if (((Method) a8zVar.getValue()) != null) {
            a8z a8zVar2 = d;
            if (((Method) a8zVar2.getValue()) != null) {
                Method method = (Method) a8zVar.getValue();
                method.getClass();
                Method method2 = (Method) a8zVar2.getValue();
                method2.getClass();
                Object objInvoke = method2.invoke(this.f38688a, null);
                if (objInvoke != null) {
                    method.invoke(objInvoke, 0, null, 0, null);
                    return;
                } else {
                    jf4.n("Required value was null.");
                    return;
                }
            }
        }
        a();
    }

    public final d8r e(String str) {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.f38688a.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new d8r(sQLiteStatementCompileStatement);
    }

    public final void k() {
        this.f38688a.endTransaction();
    }

    public final void l(String str) {
        this.f38688a.execSQL(str);
    }

    public final void n(Object[] objArr) {
        this.f38688a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final Cursor q(vkn0 vkn0Var) {
        final awh awhVar = new awh(vkn0Var, (byte) 29);
        Cursor cursorRawQueryWithFactory = this.f38688a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: a.v7r
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) awhVar.j(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, vkn0Var.q(), c, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    public final void r() {
        this.f38688a.setTransactionSuccessful();
    }
}
