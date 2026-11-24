package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class gg5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1p f11237a;

    public gg5(s1p s1pVar, byte b) {
        s1pVar.getClass();
        switch (b) {
            case 1:
                this.f11237a = s1pVar;
                break;
            case 2:
                this.f11237a = s1pVar;
                break;
            case 3:
                this.f11237a = s1pVar;
                break;
            case 4:
                this.f11237a = s1pVar;
                break;
            case 5:
                this.f11237a = s1pVar;
                break;
            case 6:
                this.f11237a = s1pVar;
                break;
            default:
                this.f11237a = s1pVar;
                break;
        }
    }

    public void a(g2p g2pVar) {
        this.f11237a.a(cui0.b(new j1p(g2pVar.f10570a, (byte) 0)), 11048L);
    }

    public void b(agp agpVar, List list) {
        list.getClass();
        yni0 yni0Var = new yni0();
        yni0Var.add(new j1p(agpVar.f835a, (byte) 0));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ofp) obj) != ofp.UNKNOWN) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            yni0Var.add(new j1p(CollectionsKt.b0(arrayList, null, null, null, new e4p((byte) 13), 31), (byte) 1));
        }
        this.f11237a.a(cui0.a(yni0Var), 3189L);
    }

    public void c(int i, y1p y1pVar) {
        this.f11237a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 0), new j1p(y1pVar.f41868a, (byte) 0)}), 3004L);
    }

    public void d(int i) {
        y1p y1pVar = y1p.MAIN;
        this.f11237a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p("popular_new_aggregator", (byte) 0)}), 3004L);
    }

    public void e(int i, String str, int i2, y1p y1pVar, Float f) {
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(i, (byte) 2));
        yni0Var.add(new i1p(i2, (byte) 0));
        if (str.length() > 0) {
            Integer intOrNull = StringsKt.toIntOrNull(str);
            yni0Var.add(new i1p(intOrNull != null ? intOrNull.intValue() : 0, (byte) 1));
        }
        yni0Var.add(new j1p(y1pVar.f41868a, (byte) 0));
        if (f != null) {
            yni0Var.add(new h1p(f.floatValue(), (byte) 0));
        }
        this.f11237a.a(cui0.a(yni0Var), 3000L);
    }

    public void f(int i, int i2, y1p y1pVar) {
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(i, (byte) 2));
        if (i2 != 0) {
            yni0Var.add(new i1p(i2, (byte) 0));
        }
        yni0Var.add(new j1p(y1pVar.f41868a, (byte) 0));
        this.f11237a.a(cui0.a(yni0Var), 3132L);
    }

    public void g(y1p y1pVar) {
        this.f11237a.a(cui0.b(new j1p(y1pVar.f41868a, (byte) 0)), 3122L);
    }

    public void h(String str, long j, boolean z) {
        this.f11237a.a(tx3.l0(new k1p[]{new i1p((int) j, (byte) 2), new j1p(z ? "live" : "line", (byte) 0), new j1p(str, (byte) 1)}), 11100L);
    }

    public void i(String str) {
        b1j.v(str, this.f11237a, 3145L);
    }

    public void j(ldp ldpVar) {
        this.f11237a.a(cui0.b(new j1p(ldpVar.f19862a, (byte) 0)), 11255L);
    }

    public void k(String str) {
        b1j.v(str, this.f11237a, 10781L);
    }

    public void l(int i, String str) {
        this.f11237a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p("top_champ", (byte) 0), new j1p(str, (byte) 1)}), 10360L);
    }

    public void m(String str, String str2) {
        this.f11237a.a(tx3.l0(new k1p[]{new j1p(str2, (byte) 0), new j1p(str, (byte) 1)}), 10360L);
    }

    public void n(Integer num, Integer num2, String str) {
        yni0 yni0Var = new yni0();
        if (num != null) {
            yni0Var.add(new i1p(num));
        }
        if (num2 != null) {
            yni0Var.add(new i1p(num2, (byte) 0));
        }
        yni0Var.add(new j1p(str, (byte) 0));
        this.f11237a.a(cui0.a(yni0Var), 3053L);
    }

    public void o() {
        b1j.v("phone", this.f11237a, 3080L);
    }

    public void p(y1p y1pVar) {
        yni0 yni0Var = new yni0();
        yni0Var.add(new j1p(y1pVar.f41868a, (byte) 0));
        this.f11237a.a(cui0.a(yni0Var), 3131L);
    }

    public void q(String str, String str2) {
        this.f11237a.a(tx3.l0(new k1p[]{new j1p(str, (byte) 0), new j1p(str2, (byte) 1)}), 3051L);
    }

    public void r(String str, String str2) {
        this.f11237a.a(tx3.l0(new k1p[]{new j1p(str, (byte) 0), new j1p(str2, (byte) 2)}), 3186L);
    }

    public void s() {
        b1j.v("telegram", this.f11237a, 3080L);
    }

    public void t(y1p y1pVar) {
        yni0 yni0Var = new yni0();
        yni0Var.add(new j1p(y1pVar.f41868a, (byte) 0));
        this.f11237a.a(cui0.a(yni0Var), 10626L);
    }

    public void u(String str, nfp nfpVar) {
        str.getClass();
        this.f11237a.a(tx3.l0(new k1p[]{new j1p("sport", (byte) 0), new j1p(nfpVar.f23447a, (byte) 1), new j1p(str, (byte) 2)}), 3186L);
    }
}
