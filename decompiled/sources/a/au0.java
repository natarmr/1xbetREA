package a;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class au0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1p f1455a;

    public au0(s1p s1pVar, byte b) {
        s1pVar.getClass();
        switch (b) {
            case 1:
                this.f1455a = s1pVar;
                break;
            case 2:
                this.f1455a = s1pVar;
                break;
            case 3:
                this.f1455a = s1pVar;
                break;
            case 4:
                this.f1455a = s1pVar;
                break;
            case 5:
                this.f1455a = s1pVar;
                break;
            case 6:
                this.f1455a = s1pVar;
                break;
            case 7:
                this.f1455a = s1pVar;
                break;
            case 8:
                this.f1455a = s1pVar;
                break;
            case 9:
                this.f1455a = s1pVar;
                break;
            case 10:
                this.f1455a = s1pVar;
                break;
            case 11:
                this.f1455a = s1pVar;
                break;
            case 12:
                this.f1455a = s1pVar;
                break;
            case 13:
                this.f1455a = s1pVar;
                break;
            case 14:
                this.f1455a = s1pVar;
                break;
            case 15:
                this.f1455a = s1pVar;
                break;
            default:
                this.f1455a = s1pVar;
                break;
        }
    }

    public void a(String str, String str2) {
        str2.getClass();
        this.f1455a.a(tx3.l0(new k1p[]{new j1p(str2, (byte) 0), new j1p(str, (byte) 1)}), 10957L);
    }

    public void b(String str, String str2, String str3) {
        this.f1455a.a(tx3.l0(new k1p[]{new j1p(str3, (byte) 0), new j1p(str, (byte) 1), new j1p(str2, (byte) 2)}), 3205L);
    }

    public void c(String str, ArrayList arrayList) {
        this.f1455a.a(tx3.l0(new k1p[]{new j1p(str, (byte) 0), new j1p(CollectionsKt.b0(arrayList, null, null, null, null, 63), (byte) 1)}), 3202L);
    }

    public void d(String str, String str2, String str3) {
        Set setC = dui0.c(new j1p(str, (byte) 0));
        if (str2 != null && str2.length() != 0 && StringsKt.t0(str2) != null) {
            setC.add(new i1p((byte) 2, Long.parseLong(str2)));
        }
        if (str3 != null && str3.length() != 0) {
            setC.add(new j1p(str3, (byte) 1));
        }
        this.f1455a.a(setC, 3192L);
    }

    public void e(String str) {
        b1j.v(str, this.f1455a, 3197L);
    }

    public void f(int i, String str) {
        this.f1455a.a(tx3.l0(new k1p[]{new j1p(str, (byte) 0), new i1p(i, (byte) 2)}), 3198L);
    }

    public void g(String str) {
        b1j.v(str, this.f1455a, 3388L);
    }

    public void h(String str) {
        b1j.v(str, this.f1455a, 3387L);
    }

    public void i(float f, String str, String str2, String str3, String str4) {
        Set setC = dui0.c(new h1p(f, (byte) 0), new j1p(str, (byte) 0), new j1p(str2, (byte) 1));
        if (str3 != null && str3.length() != 0 && StringsKt.t0(str3) != null) {
            setC.add(new i1p((byte) 2, Long.parseLong(str3)));
        }
        if (str4 != null && str4.length() != 0) {
            setC.add(new j1p(str4, (byte) 2));
        }
        this.f1455a.a(setC, 10665L);
    }

    public void j(String str) {
        b1j.v(str, this.f1455a, 3196L);
    }

    public void k(int i, int i2) {
        this.f1455a.a(tx3.l0(new k1p[]{new i1p(i2, (byte) 2), new i1p(i, (byte) 0), new j1p("OpenGame2", (byte) 0)}), 3160L);
    }

    public void l(String str) {
        b1j.v(str, this.f1455a, 3222L);
    }

    public void m(String str) {
        this.f1455a.a(tx3.l0(new k1p[]{new j1p("cancel", (byte) 0), new j1p(str, (byte) 1)}), 3344L);
    }

    public void n(String str) {
        this.f1455a.a(tx3.l0(new k1p[]{new j1p("settings", (byte) 0), new j1p(str, (byte) 1)}), 3344L);
    }

    public void o(String str, String str2) {
        this.f1455a.a(tx3.l0(new k1p[]{new j1p(str, (byte) 0), new j1p(str2, (byte) 1)}), 3282L);
    }

    public void p(ohk0 ohk0Var) {
        this.f1455a.a(cui0.b(new j1p(ohk0Var.f25269a, (byte) 0)), 3079L);
    }

    public void q(k51 k51Var) {
        String lowerCase = k51Var.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.f1455a.a(cui0.b(new j1p(lowerCase, (byte) 0)), 12040L);
    }

    public void r(String str, long j, boolean z) {
        this.f1455a.a(dui0.d(new i1p((byte) 2, j), new j1p(String.valueOf(z), (byte) 0), str.length() > 0 ? new j1p(str, (byte) 1) : null), 3358L);
    }
}
