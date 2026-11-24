package a;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class hbi {
    public Object A;
    public Object b;
    public Object c;
    public Object g;
    public Object q;
    public Object d = this;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12771a = i8i.f(this, 1);
    public Object e = i8i.f(this, 0);
    public Object f = i8i.f(this, 5);
    public Object h = i8i.f(this, 8);
    public Object i = i8i.f(this, 9);
    public Object j = i8i.f(this, 10);
    public Object k = i8i.f(this, 6);
    public Object l = i8i.f(this, 12);
    public Object m = i8i.f(this, 13);
    public Object n = i8i.f(this, 11);
    public Object o = i8i.f(this, 17);
    public Object p = i8i.f(this, 16);
    public Object r = i8i.f(this, 19);
    public Object s = i8i.f(this, 15);
    public Object t = i8i.f(this, 20);
    public Object u = i8i.f(this, 14);
    public Object v = i8i.f(this, 3);
    public Object w = i8i.f(this, 2);
    public Object x = i8i.f(this, 21);
    public Object y = i8i.f(this, 22);
    public Object z = i8i.f(this, 23);

    public hbi(ok50 ok50Var, y78 y78Var) {
        this.b = ok50Var;
        this.c = y78Var;
        byte b = 25;
        this.g = n0k0.a(new r5i(this, 7, b));
        this.q = n0k0.a(new r5i(this, 18, b));
        this.A = new r5i(this, 4, b);
    }

    public Context a() {
        Context context = ((i1a) ((ok50) this.b).f25390a).f13988a;
        x1x.y(context);
        return context;
    }

    public ivn b() {
        xyt xytVar = (xyt) this.h;
        gst0 gst0Var = (gst0) this.i;
        x1u x1uVar = new x1u(gst0Var, (byte) 1);
        qf9 qf9Var = new qf9(d());
        ntu ntuVar = (ntu) this.m;
        pru pruVar = (pru) this.c;
        return new ivn(new qgd(xytVar, x1uVar, qf9Var, new a6u((Object) ntuVar, (Object) pruVar, this.n, this.o, (Object) new k9c(new ort(gst0Var, (byte) 3)), (byte) 10), new rf9(d()), pruVar, new rou((b3c0) this.p, (byte) 0)));
    }

    public void c(byte[] bArr, int i) {
        if (((byte[]) this.f) == null || i == 3 || !Objects.equals((Integer) this.g, 3)) {
            this.f = (byte[]) bArr.clone();
            this.g = Integer.valueOf(i);
        }
    }

    public pzu d() {
        return new pzu((agc0) ((n5d0) this.f12771a).get(), (bqc0) ((n5d0) this.e).get(), (knf0) this.j, new jw20((gii0) this.k, (byte) 15), (cqc0) ((n5d0) this.f).get(), (btt0) this.l);
    }

    public fiu0 e() {
        iyk iykVar = new iyk(2);
        iykVar.b(rtp0.class, (msi) this.z);
        iykVar.b(k5k0.class, (msi) this.A);
        return new fiu0(iykVar.a());
    }
}
