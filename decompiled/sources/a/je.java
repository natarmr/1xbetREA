package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1p f16351a;

    public je(s1p s1pVar, byte b) {
        s1pVar.getClass();
        switch (b) {
            case 1:
                this.f16351a = s1pVar;
                break;
            case 2:
                this.f16351a = s1pVar;
                break;
            case 3:
                this.f16351a = s1pVar;
                break;
            case 4:
                this.f16351a = s1pVar;
                break;
            case 5:
                this.f16351a = s1pVar;
                break;
            case 6:
                this.f16351a = s1pVar;
                break;
            case 7:
                this.f16351a = s1pVar;
                break;
            case 8:
                this.f16351a = s1pVar;
                break;
            case 9:
                this.f16351a = s1pVar;
                break;
            default:
                this.f16351a = s1pVar;
                break;
        }
    }

    public void a(Long l, long j) {
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, j));
        if (l != null) {
            yni0Var.add(new i1p(l, (byte) 0));
        }
        yni0Var.add(new j1p("video", (byte) 0));
        this.f16351a.a(cui0.a(yni0Var), 12007L);
    }

    public void b(String str) {
        b1j.v(str, this.f16351a, 10932L);
    }

    public void c(int i, String str) {
        this.f16351a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p(str, (byte) 0)}), 10933L);
    }

    public void d(String str, String str2) {
        this.f16351a.a(tx3.l0(new k1p[]{new j1p(str, (byte) 0), new j1p(str2, (byte) 1)}), 10930L);
    }

    public void e(long j, boolean z, boolean z2) {
        this.f16351a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new j1p(z ? "system" : "arrow", (byte) 0), new j1p(z2 ? "live" : "line", (byte) 1)}), 12667L);
    }

    public void f(long j, long j2, long j3, String str, boolean z) {
        i1p i1pVar = new i1p((byte) 2, j);
        i1p i1pVar2 = new i1p((byte) 0, j3);
        h1p h1pVar = new h1p(j2, (byte) 0);
        if (j != 40) {
            h1pVar = null;
        }
        this.f16351a.a(dui0.d(i1pVar, i1pVar2, h1pVar, new j1p(str, (byte) 0), new j1p(z ? "live" : "line", (byte) 1)), 3056L);
    }

    public void g(long j, long j2, long j3, String str, boolean z) {
        i1p i1pVar = new i1p((byte) 2, j);
        i1p i1pVar2 = new i1p((byte) 0, j3);
        i1p i1pVar3 = new i1p((byte) 1, j2);
        if (j != 40) {
            i1pVar3 = null;
        }
        this.f16351a.a(dui0.d(i1pVar, i1pVar2, i1pVar3, new j1p(str, (byte) 0), new j1p(z ? "live" : "line", (byte) 1)), 3056L);
    }

    public void h(long j, long j2, long j3, String str) {
        i1p i1pVar = new i1p((byte) 2, j);
        i1p i1pVar2 = new i1p((byte) 0, j3);
        i1p i1pVar3 = new i1p((byte) 1, j2);
        if (j != 40) {
            i1pVar3 = null;
        }
        this.f16351a.a(dui0.d(i1pVar, i1pVar2, i1pVar3, new j1p(str, (byte) 0), new j1p("results", (byte) 2)), 3056L);
    }

    public void i(long j, long j2) {
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, j));
        yni0Var.add(new i1p((byte) 0, j2));
        this.f16351a.a(cui0.a(yni0Var), 11092L);
    }

    public void j(long j, Long l, String str, boolean z) {
        str.getClass();
        s1p s1pVar = this.f16351a;
        if (z) {
            yni0 yni0Var = new yni0();
            yni0Var.add(new i1p((byte) 2, j));
            if (l != null) {
                yni0Var.add(new i1p(l, (byte) 0));
            }
            yni0Var.add(new j1p(str, (byte) 0));
            s1pVar.a(cui0.a(yni0Var), 12011L);
            return;
        }
        yni0 yni0Var2 = new yni0();
        yni0Var2.add(new i1p((byte) 2, j));
        if (l != null) {
            yni0Var2.add(new i1p(l, (byte) 0));
        }
        yni0Var2.add(new j1p(str, (byte) 0));
        s1pVar.a(cui0.a(yni0Var2), 12010L);
    }

    public void k(String str) {
        str.getClass();
        b1j.v(str, this.f16351a, 10926L);
    }

    public void l(long j, long j2, String str) {
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, j));
        if (j2 != 0) {
            yni0Var.add(new i1p((byte) 0, j2));
        }
        if (str != null) {
            yni0Var.add(new j1p(str, (byte) 0));
        }
        this.f16351a.a(cui0.a(yni0Var), 11239L);
    }

    public void m(int i, boolean z, String str, lz60 lz60Var) {
        str.getClass();
        lz60Var.getClass();
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(i, (byte) 2));
        yni0Var.add(new j1p(z ? "single" : "multy", (byte) 0));
        yni0Var.add(new j1p("lucky_wheel", (byte) 1));
        if (str.length() > 0) {
            yni0Var.add(new j1p(str, (byte) 2));
        }
        lz60.Companion.getClass();
        yni0Var.add(new i1p(iz60.b(lz60Var), (byte) 0));
        this.f16351a.a(cui0.a(yni0Var), 3015L);
    }

    public void n(long j, long j2, String str) {
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, j));
        if (j2 != 0) {
            yni0Var.add(new i1p((byte) 0, j2));
        }
        if (str != null) {
            yni0Var.add(new j1p(str, (byte) 0));
        }
        this.f16351a.a(cui0.a(yni0Var), 11240L);
    }

    public void o(long j, boolean z, y1p y1pVar) {
        this.f16351a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new j1p(y1pVar.f41868a, (byte) 0), new j1p(z ? "live" : "line", (byte) 1)}), 3062L);
    }

    public void p(long j, long j2, Long l, boolean z) {
        String str = z ? "simulation" : "real_match";
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, j));
        yni0Var.add(new i1p((byte) 0, j2));
        if (l != null) {
            yni0Var.add(new i1p(l, (byte) 0));
        }
        yni0Var.add(new j1p(str, (byte) 0));
        this.f16351a.a(cui0.a(yni0Var), 12213L);
    }

    public void q(String str, List list, String str2, Integer num) {
        str2.getClass();
        yni0 yni0Var = new yni0();
        if (num != null) {
            yni0Var.add(new i1p(num));
        }
        yni0Var.add(new j1p(str, (byte) 0));
        yni0Var.add(new j1p(str2, (byte) 1));
        if (!list.isEmpty()) {
            yni0Var.add(new j1p(CollectionsKt.b0(list, null, null, null, null, 63), (byte) 2));
        }
        this.f16351a.a(cui0.a(yni0Var), 12379L);
    }

    public void r(String str) {
        b1j.v(str, this.f16351a, 3181L);
    }

    public void s(long j) {
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, j));
        yni0Var.add(new j1p("zone", (byte) 0));
        this.f16351a.a(cui0.a(yni0Var), 12007L);
    }
}
