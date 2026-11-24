package a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class oxw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26033a;
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzr b;
    public final /* synthetic */ oyw0 c;

    public /* synthetic */ oxw0(oyw0 oyw0Var, com.google.android.gms.measurement.internal.zzr zzrVar, byte b) {
        this.f26033a = b;
        this.b = zzrVar;
        this.c = oyw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f26033a;
        com.google.android.gms.measurement.internal.zzr zzrVar = this.b;
        oyw0 oyw0Var = this.c;
        switch (b) {
            case 0:
                m6x0 m6x0Var = oyw0Var.f26078a;
                m6x0Var.V();
                m6x0Var.Y(zzrVar);
                break;
            case 1:
                m6x0 m6x0Var2 = oyw0Var.f26078a;
                m6x0Var2.V();
                if (m6x0Var2.y != null) {
                    ArrayList arrayList = new ArrayList();
                    m6x0Var2.z = arrayList;
                    arrayList.addAll(m6x0Var2.y);
                }
                zlw0 zlw0Var = m6x0Var2.c;
                m6x0.T(zlw0Var);
                kxw0 kxw0Var = (kxw0) zlw0Var.b;
                String str = zzrVar.f45550a;
                s0x.H(str);
                s0x.E(str);
                zlw0Var.m1();
                zlw0Var.n1();
                try {
                    SQLiteDatabase sQLiteDatabaseC2 = zlw0Var.c2();
                    String[] strArr = {str};
                    int iDelete = sQLiteDatabaseC2.delete("apps", "app_id=?", strArr) + sQLiteDatabaseC2.delete("events", "app_id=?", strArr) + sQLiteDatabaseC2.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseC2.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseC2.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseC2.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseC2.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseC2.delete("queue", "app_id=?", strArr) + sQLiteDatabaseC2.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseC2.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseC2.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseC2.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseC2.delete("upload_queue", "app_id=?", strArr);
                    if (kxw0Var.d.x1(null, btw0.c1)) {
                        iDelete += sQLiteDatabaseC2.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int iDelete2 = iDelete + sQLiteDatabaseC2.delete("diagnostic_signals", "app_id=?", strArr);
                    if (iDelete2 > 0) {
                        uuw0 uuw0Var = kxw0Var.f;
                        kxw0.g(uuw0Var);
                        uuw0Var.o.c(str, Integer.valueOf(iDelete2), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e) {
                    uuw0 uuw0Var2 = kxw0Var.f;
                    kxw0.g(uuw0Var2);
                    uuw0Var2.g.c(uuw0.q1(str), e, "Error resetting analytics data. appId, error");
                }
                if (zzrVar.h) {
                    m6x0Var2.Y(zzrVar);
                }
                break;
            default:
                m6x0 m6x0Var3 = oyw0Var.f26078a;
                m6x0Var3.V();
                m6x0Var3.n0(zzrVar);
                break;
        }
    }
}
