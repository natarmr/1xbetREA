package a;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a8r extends SQLiteOpenHelper {
    public static final /* synthetic */ int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f441a;
    public final bwl b;
    public final y78 c;
    public final boolean d;
    public boolean e;
    public final uyb0 f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8r(Context context, String str, final bwl bwlVar, final y78 y78Var, boolean z) {
        super(context, str, null, y78Var.b, new DatabaseErrorHandler() { // from class: a.x7r
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = a8r.h;
                sQLiteDatabase.getClass();
                w7r w7rVarY = hic.y(bwlVar, sQLiteDatabase);
                y78Var.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + w7rVarY + ".path");
                SQLiteDatabase sQLiteDatabase2 = w7rVarY.f38688a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        y78.i(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                y78.i((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                y78.i(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    w7rVarY.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        y78Var.getClass();
        this.f441a = context;
        this.b = bwlVar;
        this.c = y78Var;
        this.d = z;
        this.f = new uyb0(str == null ? axq.g() : str, context.getCacheDir(), false);
    }

    public final w7r a(boolean z) {
        uyb0 uyb0Var = this.f;
        try {
            uyb0Var.a((this.g || getDatabaseName() == null) ? false : true);
            this.e = false;
            SQLiteDatabase sQLiteDatabaseC = c(z);
            if (!this.e) {
                return hic.y(this.b, sQLiteDatabaseC);
            }
            close();
            return a(z);
        } finally {
            uyb0Var.b();
        }
    }

    public final SQLiteDatabase c(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.g;
        Context context = this.f441a;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof y7r) {
                    y7r y7rVar = (y7r) th;
                    int iOrdinal = y7rVar.f42166a.ordinal();
                    th = y7rVar.b;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (y7r e) {
                    throw e.b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        uyb0 uyb0Var = this.f;
        try {
            uyb0Var.a(uyb0Var.f36480a);
            super.close();
            this.b.f3330a = null;
            this.g = false;
        } finally {
            uyb0Var.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.e;
        y78 y78Var = this.c;
        if (!z && y78Var.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            hic.y(this.b, sQLiteDatabase);
            y78Var.getClass();
        } catch (Throwable th) {
            throw new y7r(z7r.f43932a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((udg0) this.c.c).d(new okn0(hic.y(this.b, sQLiteDatabase)));
        } catch (Throwable th) {
            throw new y7r(z7r.b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.s(hic.y(this.b, sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new y7r(z7r.d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.e) {
            try {
                y78 y78Var = this.c;
                w7r w7rVarY = hic.y(this.b, sQLiteDatabase);
                udg0 udg0Var = (udg0) y78Var.c;
                udg0Var.f(new okn0(w7rVarY));
                udg0Var.g = w7rVarY;
            } catch (Throwable th) {
                throw new y7r(z7r.e, th);
            }
        }
        this.g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.s(hic.y(this.b, sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new y7r(z7r.c, th);
        }
    }
}
