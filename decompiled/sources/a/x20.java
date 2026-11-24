package a;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class x20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1p f40143a;

    public x20(s1p s1pVar, byte b) {
        s1pVar.getClass();
        switch (b) {
            case 1:
                this.f40143a = s1pVar;
                break;
            case 2:
                this.f40143a = s1pVar;
                break;
            case 3:
                this.f40143a = s1pVar;
                break;
            case 4:
                this.f40143a = s1pVar;
                break;
            case 5:
                this.f40143a = s1pVar;
                break;
            default:
                this.f40143a = s1pVar;
                break;
        }
    }

    public void a(di diVar) {
        String str;
        int iOrdinal = diVar.ordinal();
        if (iOrdinal == 0) {
            str = "save";
        } else if (iOrdinal == 1) {
            str = "download";
        } else if (iOrdinal == 2) {
            str = "generate";
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return;
            }
            str = "share";
        }
        b1j.v(str, this.f40143a, 3214L);
    }

    public void b(int i, int i2, String str) {
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(i, (byte) 2));
        if (i2 > 0) {
            yni0Var.add(new i1p(i2, (byte) 0));
        }
        yni0Var.add(new j1p("add", (byte) 0));
        if (str != null) {
            yni0Var.add(new j1p(str, (byte) 1));
        }
        this.f40143a.a(cui0.a(yni0Var), 3173L);
    }

    public void c(int i, String str) {
        Set setC = dui0.c(new i1p(i, (byte) 2), new j1p("add", (byte) 0));
        if (str != null) {
            setC.add(new j1p(str, (byte) 1));
        }
        this.f40143a.a(setC, 3173L);
    }

    public void d(int i, String str, String str2, Float f) {
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(i, (byte) 2));
        yni0Var.add(new j1p(str, (byte) 0));
        yni0Var.add(new j1p(str2, (byte) 1));
        if (f != null) {
            yni0Var.add(new h1p(f.floatValue(), (byte) 0));
        }
        this.f40143a.a(cui0.a(yni0Var), 3082L);
    }

    public void e(int i, String str, String str2) {
        this.f40143a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p(str, (byte) 0), new j1p(str2, (byte) 1)}), 3081L);
    }

    public void f(long j, long j2, String str, boolean z, boolean z2) {
        String str2 = z ? "1" : "0";
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, j));
        if (j2 > 0) {
            yni0Var.add(new i1p((byte) 0, j2));
        }
        yni0Var.add(new j1p(str2, (byte) 0));
        if (z2) {
            yni0Var.add(new j1p("live", (byte) 1));
        } else {
            yni0Var.add(new j1p("line", (byte) 1));
        }
        if (str.length() > 0) {
            yni0Var.add(new j1p(str, (byte) 2));
        }
        this.f40143a.a(cui0.a(yni0Var), 3175L);
    }

    public void g(long j, long j2, long j3) {
        Set setC = dui0.c(new i1p((byte) 2, j), new i1p((byte) 0, j2));
        if (j3 != 0 && j == 40) {
            setC.add(new i1p((byte) 1, j3));
        }
        this.f40143a.a(setC, 3217L);
    }

    public void h(long j, long j2, long j3, long j4, String str, boolean z) {
        i1p i1pVar = new i1p((byte) 2, j);
        i1p i1pVar2 = new i1p((byte) 0, j3);
        i1p i1pVar3 = new i1p((byte) 1, j2);
        if (j2 == -1) {
            i1pVar3 = null;
        }
        this.f40143a.a(dui0.d(i1pVar, i1pVar2, i1pVar3, j4 != -1 ? new h1p(j4, (byte) 0) : null, new j1p(str, (byte) 0), new j1p(z ? "live" : "line", (byte) 1)), 10347L);
    }

    public void i(zm7 zm7Var) {
        this.f40143a.a(cui0.b(new j1p(zm7Var.f44611a, (byte) 0)), 11003L);
    }

    public void j(String str) {
        str.getClass();
        b1j.v(str, this.f40143a, 3195L);
    }

    public void k(Integer num, y1p y1pVar) {
        String str = y1pVar.f41868a;
        yni0 yni0Var = new yni0();
        if (num != null) {
            yni0Var.add(new i1p(num));
        }
        yni0Var.add(new j1p(str, (byte) 0));
        this.f40143a.a(cui0.a(yni0Var), 3083L);
    }

    public void l(dxo dxoVar) {
        this.f40143a.a(cui0.b(new j1p(dxoVar.f6856a, (byte) 0)), 11976L);
    }

    public void m(int i, int i2, String str) {
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(i, (byte) 2));
        if (i2 > 0) {
            yni0Var.add(new i1p(i2, (byte) 0));
        }
        yni0Var.add(new j1p("remove", (byte) 0));
        if (str != null) {
            yni0Var.add(new j1p(str, (byte) 1));
        }
        this.f40143a.a(cui0.a(yni0Var), 3173L);
    }

    public void n(int i, String str) {
        Set setC = dui0.c(new i1p(i, (byte) 2), new j1p("remove", (byte) 0));
        if (str != null) {
            setC.add(new j1p(str, (byte) 1));
        }
        this.f40143a.a(setC, 3173L);
    }

    public void o(ptn ptnVar) {
        String str;
        int iOrdinal = ptnVar.ordinal();
        if (iOrdinal == 0) {
            str = "daily_express";
        } else if (iOrdinal == 1) {
            str = "coupon_load";
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            str = "coupon_generate";
        }
        b1j.v(str, this.f40143a, 10627L);
    }

    public void p(int i) {
        b1j.r(i, this.f40143a, 3066L);
    }

    public void q(int i, int i2, String str, boolean z) {
        String str2 = z ? "follow" : "unfollow";
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(i, (byte) 2));
        if (i2 > 0) {
            yni0Var.add(new i1p(i2, (byte) 0));
        }
        yni0Var.add(new j1p(str2, (byte) 0));
        if (str != null) {
            yni0Var.add(new j1p(str, (byte) 1));
        }
        this.f40143a.a(cui0.a(yni0Var), 3173L);
    }

    public void r(String str, int i, boolean z) {
        Set setC = dui0.c(new i1p(i, (byte) 2), new j1p(z ? "follow" : "unfollow", (byte) 0));
        if (str != null) {
            setC.add(new j1p(str, (byte) 1));
        }
        this.f40143a.a(setC, 3173L);
    }

    public void s(long j, String str) {
        this.f40143a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new j1p(str, (byte) 0)}), 3311L);
    }

    public void t(String str) {
        this.f40143a.a(tx3.l0(new k1p[]{new j1p("error", (byte) 0), new j1p(str, (byte) 1)}), 3309L);
    }

    public void u(long j, String str) {
        this.f40143a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new j1p(str, (byte) 0)}), 12538L);
    }

    public void v(suc0 suc0Var) {
        boolean z = suc0Var instanceof ruc0;
        s1p s1pVar = this.f40143a;
        if (z) {
            s1pVar.a(cui0.b(new i1p((byte) 2, ((ruc0) suc0Var).f31120a)), 3094L);
            return;
        }
        if (suc0Var instanceof puc0) {
            s1pVar.a(cui0.b(new i1p((byte) 0, ((puc0) suc0Var).f27609a)), 3094L);
        } else if (suc0Var instanceof quc0) {
            s1pVar.a(cui0.b(new j1p(((quc0) suc0Var).f29340a, (byte) 0)), 3094L);
        } else {
            t9f.b();
        }
    }

    public void w(long j, long j2, int i, String str, long j3, String str2, int i2, String str3) {
        if (j != 40) {
            j2 = 0;
        }
        i1p i1pVar = new i1p((byte) 2, j);
        i1p i1pVar2 = new i1p((byte) 0, j3);
        i1p i1pVar3 = new i1p((byte) 1, j2);
        if (j2 == 0) {
            i1pVar3 = null;
        }
        h1p h1pVar = new h1p(i2, (byte) 0);
        if (i2 == -1) {
            h1pVar = null;
        }
        h1p h1pVar2 = new h1p(i, (byte) 1);
        if (i == -1) {
            h1pVar2 = null;
        }
        this.f40143a.a(dui0.d(i1pVar, i1pVar2, i1pVar3, h1pVar, h1pVar2, new j1p(str, (byte) 0), new j1p(str2, (byte) 1), str3.length() > 0 ? new j1p(str3, (byte) 2) : null), 3057L);
    }
}
