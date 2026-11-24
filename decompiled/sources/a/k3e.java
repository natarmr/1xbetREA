package a;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class k3e implements vme0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f17612a;
    public final f7m0 b;
    public float b0;
    public float c0;
    public tmk d0;
    public tmk e0;
    public pj30 f0;
    public k4e g0;
    public final HashMap h0;
    public final HashMap i0;
    public i0t0 j0;
    public vuo c = null;
    public byte d = 0;
    public byte e = 0;
    public float f = -1.0f;
    public float g = -1.0f;
    public float h = 0.5f;
    public float i = 0.5f;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public int u = 0;
    public int v = 0;
    public int w = 0;
    public float x = Float.NaN;
    public float y = Float.NaN;
    public float z = Float.NaN;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public byte I = 0;
    public Object J = null;
    public Object K = null;
    public Object L = null;
    public Object M = null;
    public Object N = null;
    public Object O = null;
    public Object P = null;
    public Object Q = null;
    public Object R = null;
    public Object S = null;
    public k3e T = null;
    public Object U = null;
    public Object V = null;
    public k3e W = null;
    public Object X = null;
    public Object Y = null;
    public Object Z = null;
    public Object a0 = null;
    public int k0 = 0;

    public k3e(f7m0 f7m0Var) {
        String str = tmk.h;
        tmk tmkVar = new tmk(str);
        String str2 = tmk.i;
        tmkVar.g = str2;
        this.d0 = tmkVar;
        tmk tmkVar2 = new tmk(str);
        tmkVar2.g = str2;
        this.e0 = tmkVar2;
        this.h0 = new HashMap();
        this.i0 = new HashMap();
        this.j0 = null;
        this.b = f7m0Var;
    }

    @Override // a.vme0
    public k4e a() {
        k4e k4eVar = this.g0;
        if (k4eVar != null) {
            return k4eVar;
        }
        k4e k4eVar2 = new k4e(this.d0.f, this.e0.f);
        this.g0 = k4eVar2;
        k4eVar2.h0 = this.f0;
        return k4eVar2;
    }

    @Override // a.vme0, a.vuo
    public void apply() {
        if (this.g0 == null) {
            return;
        }
        vuo vuoVar = this.c;
        if (vuoVar != null) {
            vuoVar.apply();
        }
        this.d0.a(this.g0, 0);
        this.e0.a(this.g0, 1);
        this.J = j(this.J);
        this.K = j(this.K);
        this.L = j(this.L);
        this.M = j(this.M);
        this.N = j(this.N);
        this.O = j(this.O);
        this.P = j(this.P);
        this.Q = j(this.Q);
        this.R = j(this.R);
        this.S = j(this.S);
        this.U = j(this.U);
        this.V = j(this.V);
        this.X = j(this.X);
        this.Y = j(this.Y);
        this.Z = j(this.Z);
        d(this.g0, this.J, 1);
        d(this.g0, this.K, 2);
        d(this.g0, this.L, 3);
        d(this.g0, this.M, 4);
        d(this.g0, this.N, 5);
        d(this.g0, this.O, 6);
        d(this.g0, this.P, 7);
        d(this.g0, this.Q, 8);
        d(this.g0, this.R, 9);
        d(this.g0, this.S, 10);
        d(this.g0, this.T, 11);
        d(this.g0, this.U, 12);
        d(this.g0, this.V, 13);
        d(this.g0, this.W, 14);
        d(this.g0, this.X, 15);
        d(this.g0, this.Y, 16);
        d(this.g0, this.Z, 17);
        d(this.g0, this.a0, 20);
        byte b = this.d;
        if (b != 0) {
            this.g0.l0 = b;
        }
        byte b2 = this.e;
        if (b2 != 0) {
            this.g0.m0 = b2;
        }
        float f = this.f;
        if (f != -1.0f) {
            this.g0.n0[0] = f;
        }
        float f2 = this.g;
        if (f2 != -1.0f) {
            this.g0.n0[1] = f2;
        }
        k4e k4eVar = this.g0;
        k4eVar.f0 = this.h;
        k4eVar.g0 = this.i;
        vdv0 vdv0Var = k4eVar.j;
        vdv0Var.f = this.x;
        vdv0Var.g = this.y;
        vdv0Var.h = this.z;
        vdv0Var.i = this.A;
        vdv0Var.j = this.B;
        vdv0Var.k = this.C;
        vdv0Var.l = this.D;
        vdv0Var.m = this.E;
        vdv0Var.n = this.G;
        vdv0Var.o = this.H;
        vdv0Var.p = this.F;
        byte b3 = this.I;
        vdv0Var.q = b3;
        k4eVar.i0 = b3;
        vdv0Var.s = this.j0;
        HashMap map = this.h0;
        for (String str : map.keySet()) {
            Integer num = (Integer) map.get(str);
            vdv0 vdv0Var2 = this.g0.j;
            int iIntValue = num.intValue();
            HashMap map2 = vdv0Var2.r;
            if (map2.containsKey(str)) {
                ((iyf) map2.get(str)).c = iIntValue;
            } else {
                map2.put(str, new iyf(str, 902, iIntValue));
            }
        }
        HashMap map3 = this.i0;
        for (String str2 : map3.keySet()) {
            float fFloatValue = ((Float) map3.get(str2)).floatValue();
            HashMap map4 = this.g0.j.r;
            if (map4.containsKey(str2)) {
                ((iyf) map4.get(str2)).d = fFloatValue;
            } else {
                map4.put(str2, new iyf(fFloatValue, 901, str2));
            }
        }
    }

    @Override // a.vme0
    public final void b(k4e k4eVar) {
        if (k4eVar == null) {
            return;
        }
        this.g0 = k4eVar;
        k4eVar.h0 = this.f0;
    }

    @Override // a.vme0
    public final vuo c() {
        return this.c;
    }

    public final void d(k4e k4eVar, Object obj, int i) {
        k4e k4eVarA = obj instanceof vme0 ? ((vme0) obj).a() : null;
        if (k4eVarA == null) {
            return;
        }
        int i2 = j3e.f15827a[hne.E(i)];
        int iE = hne.E(i);
        if (iE == 19) {
            float f = this.b0;
            k4eVar.x(7, 7, (int) this.c0, 0, k4eVarA);
            k4eVar.E = f;
            return;
        }
        switch (iE) {
            case 0:
                k4eVar.k(2).b(k4eVarA.k(2), this.j, this.p, false);
                break;
            case 1:
                k4eVar.k(2).b(k4eVarA.k(4), this.j, this.p, false);
                break;
            case 2:
                k4eVar.k(4).b(k4eVarA.k(2), this.k, this.q, false);
                break;
            case 3:
                k4eVar.k(4).b(k4eVarA.k(4), this.k, this.q, false);
                break;
            case 4:
                k4eVar.k(2).b(k4eVarA.k(2), this.l, this.r, false);
                break;
            case 5:
                k4eVar.k(2).b(k4eVarA.k(4), this.l, this.r, false);
                break;
            case 6:
                k4eVar.k(4).b(k4eVarA.k(2), this.m, this.s, false);
                break;
            case 7:
                k4eVar.k(4).b(k4eVarA.k(4), this.m, this.s, false);
                break;
            case 8:
                k4eVar.k(3).b(k4eVarA.k(3), this.n, this.t, false);
                break;
            case 9:
                k4eVar.k(3).b(k4eVarA.k(5), this.n, this.t, false);
                break;
            case 10:
                k4eVar.x(3, 6, this.n, this.t, k4eVarA);
                break;
            case 11:
                k4eVar.k(5).b(k4eVarA.k(3), this.o, this.u, false);
                break;
            case 12:
                k4eVar.k(5).b(k4eVarA.k(5), this.o, this.u, false);
                break;
            case 13:
                k4eVar.x(5, 6, this.o, this.u, k4eVarA);
                break;
            case 14:
                k4eVar.x(6, 6, this.v, this.w, k4eVarA);
                break;
            case 15:
                k4eVar.x(6, 3, this.v, this.w, k4eVarA);
                break;
            case 16:
                k4eVar.x(6, 5, this.v, this.w, k4eVarA);
                break;
        }
    }

    public final void e(Object obj) {
        this.k0 = 13;
        this.V = obj;
    }

    public final void f() {
        int i = this.k0;
        if (i == 0) {
            this.J = null;
            this.K = null;
            this.j = 0;
            this.L = null;
            this.M = null;
            this.k = 0;
            this.N = null;
            this.O = null;
            this.l = 0;
            this.P = null;
            this.Q = null;
            this.m = 0;
            this.R = null;
            this.S = null;
            this.n = 0;
            this.U = null;
            this.V = null;
            this.o = 0;
            this.X = null;
            this.a0 = null;
            this.h = 0.5f;
            this.i = 0.5f;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            return;
        }
        int iE = hne.E(i);
        if (iE == 19) {
            this.a0 = null;
            return;
        }
        switch (iE) {
            case 0:
            case 1:
                this.J = null;
                this.K = null;
                this.j = 0;
                this.p = 0;
                break;
            case 2:
            case 3:
                this.L = null;
                this.M = null;
                this.k = 0;
                this.q = 0;
                break;
            case 4:
            case 5:
                this.N = null;
                this.O = null;
                this.l = 0;
                this.r = 0;
                break;
            case 6:
            case 7:
                this.P = null;
                this.Q = null;
                this.m = 0;
                this.s = 0;
                break;
            case 8:
            case 9:
            case 10:
                this.R = null;
                this.S = null;
                this.T = null;
                this.n = 0;
                this.t = 0;
                break;
            case 11:
            case 12:
            case 13:
                this.U = null;
                this.V = null;
                this.W = null;
                this.o = 0;
                this.u = 0;
                break;
            case 14:
                this.X = null;
                break;
        }
    }

    public final void g() {
        if (this.N != null) {
            this.k0 = 5;
        } else {
            this.k0 = 6;
        }
        f();
        if (this.P != null) {
            this.k0 = 7;
        } else {
            this.k0 = 8;
        }
        f();
        if (this.J != null) {
            this.k0 = 1;
        } else {
            this.k0 = 2;
        }
        f();
        if (this.L != null) {
            this.k0 = 3;
        } else {
            this.k0 = 4;
        }
        f();
    }

    @Override // a.vme0
    public final Object getKey() {
        return this.f17612a;
    }

    public final void h() {
        if (this.R != null) {
            this.k0 = 9;
        } else {
            this.k0 = 10;
        }
        f();
        this.k0 = 15;
        f();
        if (this.U != null) {
            this.k0 = 12;
        } else {
            this.k0 = 13;
        }
        f();
    }

    public final void i(Object obj) {
        this.k0 = 8;
        this.Q = obj;
    }

    public final Object j(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof k3e) ? (vme0) this.b.c.get(obj) : obj;
    }

    public k3e k(int i) {
        int i2 = this.k0;
        if (i2 == 0) {
            this.j = i;
            this.k = i;
            this.l = i;
            this.m = i;
            this.n = i;
            this.o = i;
            return this;
        }
        int iE = hne.E(i2);
        if (iE == 19) {
            this.c0 = i;
            return this;
        }
        switch (iE) {
            case 0:
            case 1:
                this.j = i;
                break;
            case 2:
            case 3:
                this.k = i;
                break;
            case 4:
            case 5:
                this.l = i;
                break;
            case 6:
            case 7:
                this.m = i;
                break;
            case 8:
            case 9:
            case 10:
                this.n = i;
                break;
            case 11:
            case 12:
            case 13:
                this.o = i;
                break;
            case 14:
            case 15:
            case 16:
                this.v = i;
                break;
        }
        return this;
    }

    public k3e l(Float f) {
        return k(this.b.d(f));
    }

    public final void m(int i) {
        int i2 = this.k0;
        if (i2 == 0) {
            this.p = i;
            this.q = i;
            this.r = i;
            this.s = i;
            this.t = i;
            this.u = i;
            return;
        }
        switch (hne.E(i2)) {
            case 0:
            case 1:
                this.p = i;
                break;
            case 2:
            case 3:
                this.q = i;
                break;
            case 4:
            case 5:
                this.r = i;
                break;
            case 6:
            case 7:
                this.s = i;
                break;
            case 8:
            case 9:
            case 10:
                this.t = i;
                break;
            case 11:
            case 12:
            case 13:
                this.u = i;
                break;
            case 14:
            case 15:
            case 16:
                this.w = i;
                break;
        }
    }

    public final void n(Float f) {
        m(this.b.d(f));
    }

    public final void o(Object obj) {
        this.k0 = 5;
        this.N = obj;
    }

    public final void p(Object obj) {
        this.k0 = 9;
        this.R = obj;
    }
}
