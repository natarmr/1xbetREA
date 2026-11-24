package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1p f44833a;

    public zr1(s1p s1pVar, byte b) {
        s1pVar.getClass();
        switch (b) {
            case 1:
                this.f44833a = s1pVar;
                break;
            case 2:
                this.f44833a = s1pVar;
                break;
            case 3:
                this.f44833a = s1pVar;
                break;
            case 4:
                this.f44833a = s1pVar;
                break;
            case 5:
                this.f44833a = s1pVar;
                break;
            case 6:
                this.f44833a = s1pVar;
                break;
            case 7:
                this.f44833a = s1pVar;
                break;
            case 8:
                this.f44833a = s1pVar;
                break;
            default:
                this.f44833a = s1pVar;
                break;
        }
    }

    public void a(long j, Integer num, String str, boolean z) {
        i1p i1pVar = new i1p((byte) 2, j);
        i1p i1pVar2 = null;
        if (num != null) {
            if (z) {
                num = null;
            }
            if (num != null) {
                i1pVar2 = new i1p(num.intValue(), (byte) 0);
            }
        }
        this.f44833a.a(dui0.d(i1pVar, i1pVar2, new i1p(z ? 1 : 0, (byte) 1), new j1p(str, (byte) 1)), 3089L);
    }

    public void b(int i, int i2, String str, String str2, boolean z, Float f) {
        long j = z ? 3000L : 3351L;
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(i, (byte) 2));
        if (z) {
            yni0Var.add(new i1p(i2, (byte) 0));
        }
        if (str.length() > 0 && z) {
            Integer intOrNull = StringsKt.toIntOrNull(str);
            yni0Var.add(new i1p(intOrNull != null ? intOrNull.intValue() : 0, (byte) 1));
        }
        yni0Var.add(new j1p(str2, (byte) 0));
        if (f != null) {
            yni0Var.add(new h1p(f.floatValue(), (byte) 0));
        }
        this.f44833a.a(cui0.a(yni0Var), j);
    }

    public void c(lvp0 lvp0Var) {
        this.f44833a.a(tx3.l0(new k1p[]{new j1p(lvp0Var.f20726a, (byte) 0), new j1p("cancel", (byte) 1)}), 11238L);
    }

    public void d(long j, long j2, long j3, String str, boolean z, boolean z2) {
        str.getClass();
        this.f44833a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new i1p((byte) 0, j2), new i1p((byte) 1, j3), new j1p(str, (byte) 0), new j1p(z ? "live" : "line", (byte) 1), new j1p(z2 ? "remove" : "add_favor", (byte) 2)}), 12289L);
    }

    public void e(String str) {
        b1j.v(str, this.f44833a, 11108L);
    }

    public void f(String str) {
        b1j.v(str, this.f44833a, 12019L);
    }

    public void g(g1p g1pVar, boolean z, f1p f1pVar) {
        this.f44833a.a(tx3.l0(new k1p[]{new j1p(z ? "on" : "off", (byte) 0), new j1p(f1pVar.f8775a, (byte) 1), new j1p(g1pVar.f10525a, (byte) 2)}), 10361L);
    }

    public void h(lvp0 lvp0Var) {
        this.f44833a.a(tx3.l0(new k1p[]{new j1p(lvp0Var.f20726a, (byte) 0), new j1p("ignore", (byte) 1)}), 11238L);
    }

    public void i(long j, long j2, long j3, String str) {
        str.getClass();
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, j));
        yni0Var.add(new i1p((byte) 0, j3));
        if (j2 > 0) {
            yni0Var.add(new i1p((byte) 1, j2));
        }
        yni0Var.add(new j1p(str, (byte) 0));
        this.f44833a.a(cui0.a(yni0Var), 3090L);
    }

    public void j(String str, String str2) {
        this.f44833a.a(str.length() == 0 ? cui0.b(new j1p(str2, (byte) 2)) : tx3.l0(new k1p[]{new j1p(str, (byte) 1), new j1p(str2, (byte) 2)}), 3164L);
    }

    public void k(long j) {
        this.f44833a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new j1p("actions", (byte) 0)}), 3095L);
    }

    public void l(long j, long j2, long j3, String str, boolean z) {
        this.f44833a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new i1p((byte) 0, j2), new i1p((byte) 1, j3), new j1p(str, (byte) 0), new j1p(z ? "live" : "line", (byte) 1)}), 11102L);
    }

    public void m(long j, long j2, String str, Long l, Boolean bool) {
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, j));
        if (j2 != -1) {
            yni0Var.add(new i1p((byte) 0, j2));
        }
        if (l != null) {
            yni0Var.add(new i1p(l, (byte) 1));
        }
        yni0Var.add(new j1p(str, (byte) 0));
        if (bool != null) {
            yni0Var.add(new j1p(bool.booleanValue() ? "live" : "line", (byte) 1));
        }
        this.f44833a.a(cui0.a(yni0Var), 3352L);
    }

    public void n(lvp0 lvp0Var) {
        this.f44833a.a(tx3.l0(new k1p[]{new j1p(lvp0Var.f20726a, (byte) 0), new j1p("to_telegram", (byte) 1)}), 11238L);
    }

    public void o(String str) {
        b1j.v(str, this.f44833a, 12015L);
    }

    public void p(String str, String str2) {
        this.f44833a.a(tx3.l0(new k1p[]{new j1p(str, (byte) 0), new j1p(str2, (byte) 1)}), 3051L);
    }

    public void q(String str) {
        str.getClass();
        b1j.v(str, this.f44833a, 3071L);
    }

    public void r(String str, String str2) {
        str.getClass();
        this.f44833a.a(tx3.l0(new k1p[]{new j1p(str, (byte) 0), new j1p(str2, (byte) 1)}), 3072L);
    }

    public void s(int i, String str, String str2) {
        str.getClass();
        this.f44833a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p(str, (byte) 0), new j1p(str2, (byte) 1)}), 3104L);
    }

    public void t(int i, String str, String str2) {
        str.getClass();
        this.f44833a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p(str, (byte) 0), new j1p(str2, (byte) 1)}), 3107L);
    }

    public void u(int i, String str, String str2) {
        str.getClass();
        this.f44833a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p(str, (byte) 0), new j1p(str2, (byte) 1)}), 3114L);
    }

    public void v(int i, String str, String str2) {
        this.f44833a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p(str, (byte) 0), new j1p(str2, (byte) 1)}), 3108L);
    }

    public void w(int i, znk0 znk0Var) {
        znk0Var.getClass();
        this.f44833a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p(znk0Var.f44680a, (byte) 0)}), 3099L);
    }

    public void x(String str) {
        b1j.v(str, this.f44833a, 12018L);
    }

    public void y(String str, long j, boolean z) {
        this.f44833a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new j1p(str, (byte) 0), new j1p(String.valueOf(z), (byte) 1)}), 3354L);
    }

    public void z(long j, String str) {
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, 40L));
        if (j != -1) {
            yni0Var.add(new i1p((byte) 0, j));
        }
        yni0Var.add(new j1p(str, (byte) 0));
        this.f44833a.a(cui0.a(yni0Var), 12022L);
    }
}
