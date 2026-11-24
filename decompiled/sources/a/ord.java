package a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import org.xplatform.security.api.presentation.models.TokenRestoreData;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ord implements Continuation, izj, xbf, upg0, wzn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f25729a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ord(Object obj, long j, Object obj2) {
        this.b = obj;
        this.f25729a = j;
        this.c = obj2;
    }

    @Override // a.izj
    public void a(p5d0 p5d0Var) {
        ((k8f) p5d0Var.get()).d((String) this.b, this.f25729a, (d55) this.c);
    }

    @Override // a.upg0
    public Object apply(Object obj) {
        String str = (String) this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte b = ((jv00) this.c).f17183a;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(b)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f25729a;
            if (z) {
                sQLiteDatabase.execSQL(axq.h(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(b)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(b));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // a.xbf
    public Object c(Object obj) {
        TokenRestoreData tokenRestoreData = (TokenRestoreData) this.b;
        we50 we50Var = (we50) this.c;
        ((m1r) obj).getClass();
        bri0.V1.getClass();
        we50Var.getClass();
        bri0 bri0Var = new bri0();
        iiy[] iiyVarArr = bri0.W1;
        bri0Var.R1.J(bri0Var, iiyVarArr[1], tokenRestoreData);
        bri0Var.U1.u(bri0Var, iiyVarArr[3], we50Var);
        bri0Var.S1.j(bri0Var, iiyVarArr[2], this.f25729a);
        return bri0Var;
    }

    @Override // a.wzn0
    public Object k() {
        wdu wduVar = (wdu) this.b;
        q55 q55Var = (q55) this.c;
        wpg0 wpg0Var = (wpg0) wduVar.d;
        long time = ((quc) wduVar.h).getTime() + this.f25729a;
        wpg0Var.getClass();
        wpg0Var.d(new tpg0(time, q55Var));
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((rrd) this.b).e(task, this.f25729a, (HashMap) this.c);
    }

    public /* synthetic */ ord(Object obj, Object obj2, long j) {
        this.b = obj;
        this.c = obj2;
        this.f25729a = j;
    }
}
