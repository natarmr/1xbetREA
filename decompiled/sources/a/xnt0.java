package a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xnt0 implements wzn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41186a;
    public final /* synthetic */ wpg0 b;

    public /* synthetic */ xnt0(wpg0 wpg0Var, byte b) {
        this.f41186a = b;
        this.b = wpg0Var;
    }

    @Override // a.wzn0
    public final Object k() {
        byte b = this.f41186a;
        wpg0 wpg0Var = this.b;
        switch (b) {
            case 0:
                wpg0Var.getClass();
                int i = auc.e;
                mii0 mii0Var = new mii0((byte) 18);
                mii0Var.c = null;
                mii0Var.d = new ArrayList();
                mii0Var.e = null;
                mii0Var.b = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseA = wpg0Var.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    auc aucVar = (auc) wpg0.q(sQLiteDatabaseA.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new hi(wpg0Var, map, mii0Var, (byte) 16));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return aucVar;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            default:
                long time = wpg0Var.b.getTime() - wpg0Var.d.d;
                SQLiteDatabase sQLiteDatabaseA2 = wpg0Var.a();
                sQLiteDatabaseA2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(time)};
                    Cursor cursorRawQuery = sQLiteDatabaseA2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            wpg0Var.k(cursorRawQuery.getInt(0), jv00.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseA2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseA2.setTransactionSuccessful();
                    sQLiteDatabaseA2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseA2.endTransaction();
                    throw th2;
                }
        }
    }
}
