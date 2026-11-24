package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Bundle;
import android.os.SystemClock;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class c2x0 extends etw0 {
    public volatile r1x0 d;
    public volatile r1x0 e;
    public r1x0 f;
    public final ConcurrentHashMap g;
    public zzdd h;
    public volatile boolean i;
    public volatile r1x0 j;
    public r1x0 k;
    public boolean l;
    public final Object m;

    public c2x0(kxw0 kxw0Var) {
        super(kxw0Var);
        this.m = new Object();
        this.g = new ConcurrentHashMap();
    }

    @Override // a.etw0
    public final boolean o1() {
        return false;
    }

    public final r1x0 p1(boolean z) {
        n1();
        m1();
        r1x0 r1x0Var = this.f;
        return (z && r1x0Var == null) ? this.k : r1x0Var;
    }

    public final String q1(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        kxw0 kxw0Var = (kxw0) this.b;
        int length2 = str2.length();
        kxw0Var.d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        kxw0Var.d.getClass();
        return str2.substring(0, 500);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    public final void r1(r1x0 r1x0Var, r1x0 r1x0Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        Bundle bundle2;
        boolean z3 = r1x0Var.e;
        kxw0 kxw0Var = (kxw0) this.b;
        m1();
        boolean z4 = false;
        if (r1x0Var2 != null) {
            if (r1x0Var2.c == r1x0Var.c && Objects.equals(r1x0Var2.b, r1x0Var.b) && Objects.equals(r1x0Var2.f29705a, r1x0Var.f29705a)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.f != null) {
            z4 = true;
        }
        if (z2) {
            Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
            x6x0.i2(r1x0Var, bundle3, true);
            if (r1x0Var2 != null) {
                String str = r1x0Var2.f29705a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = r1x0Var2.b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", r1x0Var2.c);
            }
            if (z4) {
                w4x0 w4x0Var = kxw0Var.h;
                kxw0.f(w4x0Var);
                dr8 dr8Var = w4x0Var.g;
                long j3 = j - dr8Var.b;
                dr8Var.b = j;
                if (j3 > 0) {
                    x6x0 x6x0Var = kxw0Var.i;
                    kxw0.e(x6x0Var);
                    x6x0Var.Y1(bundle3, j3);
                }
            }
            bkw0 bkw0Var = kxw0Var.d;
            lwf lwfVar = kxw0Var.k;
            if (!bkw0Var.B1()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != z3 ? "auto" : Payload.TYPE_APP;
            lwfVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z3) {
                long j4 = r1x0Var.f;
                if (j4 != 0) {
                    j2 = j4;
                } else {
                    j2 = jCurrentTimeMillis;
                }
            } else {
                j2 = jCurrentTimeMillis;
            }
            long jElapsedRealtime = kxw0Var.d.x1(null, btw0.e1) ? SystemClock.elapsedRealtime() : 0L;
            if (z3) {
                bundle2 = bundle3;
                long j5 = r1x0Var.g;
                if (j5 != 0) {
                    jElapsedRealtime = j5;
                }
            } else {
                bundle2 = bundle3;
            }
            b1x0 b1x0Var = kxw0Var.m;
            kxw0.f(b1x0Var);
            b1x0Var.t1(j2, jElapsedRealtime, bundle2, str3, "_vs");
        }
        if (z4) {
            u1(this.f, true, j);
        }
        this.f = r1x0Var;
        if (z3) {
            this.k = r1x0Var;
        }
        a4x0 a4x0VarI = kxw0Var.i();
        a4x0VarI.m1();
        a4x0VarI.n1();
        a4x0VarI.z1(new lfr(a4x0VarI, r1x0Var));
    }

    public final void s1(zzdd zzddVar, Bundle bundle) {
        Bundle bundle2;
        if (!((kxw0) this.b).d.B1() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.g.put(Integer.valueOf(zzddVar.f45526a), new r1x0(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(ParameterNames.ID)));
    }

    public final void t1(String str, r1x0 r1x0Var, boolean z) {
        r1x0 r1x0Var2;
        r1x0 r1x0Var3 = this.d == null ? this.e : this.d;
        if (r1x0Var.b == null) {
            String strQ1 = str != null ? q1(str) : null;
            r1x0Var2 = new r1x0(r1x0Var.c, r1x0Var.f, r1x0Var.g, r1x0Var.f29705a, strQ1, r1x0Var.e);
        } else {
            r1x0Var2 = r1x0Var;
        }
        this.e = this.d;
        this.d = r1x0Var2;
        kxw0 kxw0Var = (kxw0) this.b;
        kxw0Var.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        fxw0 fxw0Var = kxw0Var.g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new u1x0(this, r1x0Var2, r1x0Var3, jElapsedRealtime, z));
    }

    public final void u1(r1x0 r1x0Var, boolean z, long j) {
        kxw0 kxw0Var = (kxw0) this.b;
        dqw0 dqw0Var = kxw0Var.n;
        kxw0.d(dqw0Var);
        kxw0Var.k.getClass();
        dqw0Var.p1(SystemClock.elapsedRealtime());
        boolean z2 = r1x0Var != null && r1x0Var.d;
        w4x0 w4x0Var = kxw0Var.h;
        kxw0.f(w4x0Var);
        if (!w4x0Var.g.r(j, z2, z) || r1x0Var == null) {
            return;
        }
        r1x0Var.d = false;
    }

    public final r1x0 v1(zzdd zzddVar) {
        s0x.H(zzddVar);
        Integer numValueOf = Integer.valueOf(zzddVar.f45526a);
        ConcurrentHashMap concurrentHashMap = this.g;
        r1x0 r1x0Var = (r1x0) concurrentHashMap.get(numValueOf);
        if (r1x0Var == null) {
            String strQ1 = q1(zzddVar.b);
            x6x0 x6x0Var = ((kxw0) this.b).i;
            kxw0.e(x6x0Var);
            r1x0 r1x0Var2 = new r1x0(null, strQ1, x6x0Var.k2());
            concurrentHashMap.put(numValueOf, r1x0Var2);
            r1x0Var = r1x0Var2;
        }
        return this.j != null ? this.j : r1x0Var;
    }
}
