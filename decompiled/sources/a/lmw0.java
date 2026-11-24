package a;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzbf;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class lmw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20318a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final zzbf g;

    public lmw0(kxw0 kxw0Var, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        zzbf zzbfVar;
        s0x.E(str2);
        s0x.E(str3);
        this.f20318a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.j.b(uuw0.q1(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbfVar = new zzbf(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    uuw0 uuw0Var2 = kxw0Var.f;
                    kxw0.g(uuw0Var2);
                    uuw0Var2.g.a("Param name can't be null");
                    it.remove();
                } else {
                    x6x0 x6x0Var = kxw0Var.i;
                    kxw0.e(x6x0Var);
                    Object objV1 = x6x0Var.v1(bundle2.get(next), next);
                    if (objV1 == null) {
                        uuw0 uuw0Var3 = kxw0Var.f;
                        kxw0.g(uuw0Var3);
                        uuw0Var3.j.b(kxw0Var.j.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        x6x0 x6x0Var2 = kxw0Var.i;
                        kxw0.e(x6x0Var2);
                        x6x0Var2.D1(next, bundle2, objV1);
                    }
                }
            }
            zzbfVar = new zzbf(bundle2);
        }
        this.g = zzbfVar;
    }

    public final lmw0 a(kxw0 kxw0Var, long j) {
        return new lmw0(kxw0Var, this.c, this.f20318a, this.b, this.d, this.e, j, this.g);
    }

    public final String toString() {
        String string = this.g.f45543a.toString();
        String str = this.f20318a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        f140.v(sb, "Event{appId='", str, "', name='", str2);
        return rw2.o(sb, "', params=", string, "}");
    }

    public lmw0(kxw0 kxw0Var, String str, String str2, String str3, long j, long j2, long j3, zzbf zzbfVar) {
        s0x.E(str2);
        s0x.E(str3);
        this.f20318a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.j.c(uuw0.q1(str2), uuw0.q1(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.g = zzbfVar;
    }
}
