package a;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class dqw0 extends zrw0 {
    public final gx3 c;
    public final gx3 d;
    public long e;

    public dqw0(kxw0 kxw0Var) {
        super(kxw0Var);
        this.d = new gx3(0);
        this.c = new gx3(0);
    }

    public final void n1(long j, String str) {
        kxw0 kxw0Var = (kxw0) this.b;
        if (str == null || str.length() == 0) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.g.a("Ad unit id must be a non-empty string");
        } else {
            fxw0 fxw0Var = kxw0Var.g;
            kxw0.g(fxw0Var);
            fxw0Var.v1(new hbw0(this, str, j, (byte) 0));
        }
    }

    public final void o1(long j, String str) {
        kxw0 kxw0Var = (kxw0) this.b;
        if (str == null || str.length() == 0) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.g.a("Ad unit id must be a non-empty string");
        } else {
            fxw0 fxw0Var = kxw0Var.g;
            kxw0.g(fxw0Var);
            fxw0Var.v1(new hbw0(this, str, j, (byte) 1));
        }
    }

    public final void p1(long j) {
        c2x0 c2x0Var = ((kxw0) this.b).l;
        kxw0.f(c2x0Var);
        r1x0 r1x0VarP1 = c2x0Var.p1(false);
        gx3 gx3Var = this.c;
        for (String str : (cx3) gx3Var.keySet()) {
            r1(str, j - ((Long) gx3Var.get(str)).longValue(), r1x0VarP1);
        }
        if (!gx3Var.isEmpty()) {
            q1(j - this.e, r1x0VarP1);
        }
        s1(j);
    }

    public final void q1(long j, r1x0 r1x0Var) {
        kxw0 kxw0Var = (kxw0) this.b;
        if (r1x0Var == null) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.o.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.o.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            x6x0.i2(r1x0Var, bundle, true);
            b1x0 b1x0Var = kxw0Var.m;
            kxw0.f(b1x0Var);
            b1x0Var.s1(bundle, "am", "_xa");
        }
    }

    public final void r1(String str, long j, r1x0 r1x0Var) {
        kxw0 kxw0Var = (kxw0) this.b;
        if (r1x0Var == null) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.o.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                uuw0 uuw0Var2 = kxw0Var.f;
                kxw0.g(uuw0Var2);
                uuw0Var2.o.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            x6x0.i2(r1x0Var, bundle, true);
            b1x0 b1x0Var = kxw0Var.m;
            kxw0.f(b1x0Var);
            b1x0Var.s1(bundle, "am", "_xu");
        }
    }

    public final void s1(long j) {
        gx3 gx3Var = this.c;
        Iterator it = ((cx3) gx3Var.keySet()).iterator();
        while (it.hasNext()) {
            gx3Var.put((String) it.next(), Long.valueOf(j));
        }
        if (gx3Var.isEmpty()) {
            return;
        }
        this.e = j;
    }
}
