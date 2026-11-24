package a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.gov.nist.core.Separators;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wpg0 implements Closeable {
    public static final gwn f = new gwn("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2h0 f39544a;
    public final quc b;
    public final quc c;
    public final r35 d;
    public final o5d0 e;

    public wpg0(quc qucVar, quc qucVar2, r35 r35Var, v2h0 v2h0Var, o5d0 o5d0Var) {
        this.f39544a = v2h0Var;
        this.b = qucVar;
        this.c = qucVar2;
        this.d = r35Var;
        this.e = o5d0Var;
    }

    public static Long c(SQLiteDatabase sQLiteDatabase, q55 q55Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(q55Var.f28133a, String.valueOf(pwb0.a(q55Var.c))));
        byte[] bArr = q55Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String n(Iterable iterable) {
        StringBuilder sb = new StringBuilder(Separators.LPAREN);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((o45) it.next()).f24616a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object q(Cursor cursor, upg0 upg0Var) {
        try {
            return upg0Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        v2h0 v2h0Var = this.f39544a;
        Objects.requireNonNull(v2h0Var);
        quc qucVar = this.c;
        long time = qucVar.getTime();
        while (true) {
            try {
                return v2h0Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (qucVar.getTime() >= ((long) this.d.c) + time) {
                    throw new vzn0("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39544a.close();
    }

    public final Object d(upg0 upg0Var) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = upg0Var.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    public final ArrayList e(SQLiteDatabase sQLiteDatabase, q55 q55Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long lC = c(sQLiteDatabase, q55Var);
        if (lC == null) {
            return arrayList;
        }
        q(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lC.toString()}, null, null, null, String.valueOf(i)), new hi(this, arrayList, q55Var, (byte) 15));
        return arrayList;
    }

    public final void k(long j, jv00 jv00Var, String str) {
        d(new ord(str, jv00Var, j));
    }

    public final Object l(wzn0 wzn0Var) {
        SQLiteDatabase sQLiteDatabaseA = a();
        quc qucVar = this.c;
        long time = qucVar.getTime();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                try {
                    Object objK = wzn0Var.k();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return objK;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (qucVar.getTime() >= ((long) this.d.c) + time) {
                    throw new vzn0("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
