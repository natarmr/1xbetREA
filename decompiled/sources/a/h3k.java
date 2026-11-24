package a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h3k implements n3k, wzn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12388a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h3k(wdu wduVar, Iterable iterable, q55 q55Var, long j) {
        this.f12388a = (byte) 2;
        this.b = wduVar;
        this.e = iterable;
        this.d = q55Var;
        this.c = j;
    }

    @Override // a.n3k
    public ScheduledFuture a(prc prcVar) {
        byte b = this.f12388a;
        Object obj = this.d;
        long j = this.c;
        Object obj2 = this.e;
        m3k m3kVar = (m3k) this.b;
        switch (b) {
            case 0:
                return m3kVar.b.schedule(new k3k(m3kVar, (Runnable) obj2, prcVar, (byte) 1), j, (TimeUnit) obj);
            default:
                return m3kVar.b.schedule(new l3k(m3kVar, (Callable) obj2, prcVar, (byte) 0), j, (TimeUnit) obj);
        }
    }

    @Override // a.wzn0
    public Object k() {
        wdu wduVar = (wdu) this.b;
        Iterable iterable = (Iterable) this.e;
        q55 q55Var = (q55) this.d;
        wpg0 wpg0Var = (wpg0) wduVar.d;
        wpg0Var.getClass();
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(wpg0.n(iterable));
            SQLiteDatabase sQLiteDatabaseA = wpg0Var.a();
            sQLiteDatabaseA.beginTransaction();
            try {
                sQLiteDatabaseA.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        wpg0Var.k(cursorRawQuery.getInt(0), jv00.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseA.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseA.setTransactionSuccessful();
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseA.endTransaction();
                throw th2;
            }
        }
        wpg0Var.d(new tpg0(((quc) wduVar.h).getTime() + this.c, q55Var));
        return null;
    }

    public /* synthetic */ h3k(m3k m3kVar, Object obj, long j, TimeUnit timeUnit, byte b) {
        this.f12388a = b;
        this.b = m3kVar;
        this.e = obj;
        this.c = j;
        this.d = timeUnit;
    }
}
