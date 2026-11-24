package a;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ix0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1p f15516a;

    public ix0(s1p s1pVar, byte b) {
        s1pVar.getClass();
        switch (b) {
            case 1:
                this.f15516a = s1pVar;
                break;
            case 2:
                this.f15516a = s1pVar;
                break;
            case 3:
                this.f15516a = s1pVar;
                break;
            case 4:
                this.f15516a = s1pVar;
                break;
            case 5:
                this.f15516a = s1pVar;
                break;
            case 6:
                this.f15516a = s1pVar;
                break;
            case 7:
                this.f15516a = s1pVar;
                break;
            case 8:
                this.f15516a = s1pVar;
                break;
            case 9:
                this.f15516a = s1pVar;
                break;
            case 10:
                this.f15516a = s1pVar;
                break;
            default:
                this.f15516a = s1pVar;
                break;
        }
    }

    public static void c(ix0 ix0Var, int i, Integer num) {
        ix0Var.getClass();
        s1p s1pVar = ix0Var.f15516a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(i, (byte) 2));
        if (num != null) {
            yni0Var.add(new i1p(num.intValue(), (byte) 1));
        }
        yni0Var.add(new j1p("favorite", (byte) 0));
        s1pVar.a(cui0.a(yni0Var), 3019L);
    }

    public void a(int i, int i2, Integer num, String str, String str2) {
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(i, (byte) 2));
        yni0Var.add(new i1p(i2, (byte) 0));
        if (num != null) {
            yni0Var.add(new i1p(num.intValue(), (byte) 1));
        }
        yni0Var.add(new j1p(str, (byte) 0));
        if (str2 != null) {
            yni0Var.add(new j1p(str2, (byte) 1));
        }
        this.f15516a.a(cui0.a(yni0Var), 3019L);
    }

    public void d(int i) {
        y1p y1pVar = y1p.MAIN;
        this.f15516a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p("my_aggregator", (byte) 0)}), 3083L);
    }

    public void e(Integer num, String str, String str2, String str3, lz60 lz60Var, Integer num2) {
        yni0 yni0Var = new yni0();
        if (num != null) {
            yni0Var.add(new i1p(num));
        }
        if (str != null) {
            yni0Var.add(new j1p(str, (byte) 0));
        }
        yni0Var.add(new j1p(str2, (byte) 1));
        if (str3 != null && str3.length() > 0) {
            yni0Var.add(new j1p(str3, (byte) 2));
        }
        if (lz60Var != null) {
            lz60.Companion.getClass();
            yni0Var.add(new i1p(iz60.b(lz60Var), (byte) 0));
        }
        if (num2 != null) {
            yni0Var.add(new i1p(num2, (byte) 1));
        }
        this.f15516a.a(cui0.a(yni0Var), 3015L);
    }

    public void f(String str, int i, boolean z) {
        String str2 = z ? "company" : "players";
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(i, (byte) 2));
        yni0Var.add(new j1p(str2, (byte) 0));
        if (str.length() > 0) {
            yni0Var.add(new j1p(str, (byte) 1));
        }
        this.f15516a.a(cui0.a(yni0Var), 3012L);
    }

    public void g(ArrayList arrayList) {
        this.f15516a.a(cui0.b(new j1p(CollectionsKt.b0(arrayList, null, null, null, null, 63), (byte) 0)), 3335L);
    }

    public void h(int i, Integer num, String str, String str2, boolean z) {
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(i, (byte) 2));
        yni0Var.add(new i1p(num.intValue(), (byte) 0));
        yni0Var.add(new j1p(z ? "add_favor" : "remove", (byte) 0));
        if (str != null) {
            yni0Var.add(new j1p(str, (byte) 1));
        }
        if (str2 != null) {
            yni0Var.add(new j1p(str2, (byte) 2));
        }
        this.f15516a.a(cui0.a(yni0Var), 3055L);
    }

    public void j(y1p y1pVar) {
        this.f15516a.a(cui0.b(new j1p(y1pVar.f41868a, (byte) 0)), 3293L);
    }

    public void k(int i, String str) {
        this.f15516a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p(str, (byte) 0)}), 12842L);
    }

    public void l(y1p y1pVar) {
        this.f15516a.a(cui0.b(new j1p(y1pVar.f41868a, (byte) 0)), 3085L);
    }

    public void m() {
        b1j.v("menu_aggregator", this.f15516a, 3084L);
    }
}
