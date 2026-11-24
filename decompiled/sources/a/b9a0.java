package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b9a0 {
    public static final b9a0 g = new b9a0("", "", 0, "", bre.c, "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2199a;
    public final String b;
    public final int c;
    public final String d;
    public final bre e;
    public final String f;

    public b9a0(String str, String str2, int i, String str3, bre breVar, String str4) {
        breVar.getClass();
        this.f2199a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = breVar;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9a0)) {
            return false;
        }
        b9a0 b9a0Var = (b9a0) obj;
        return this.f2199a.equals(b9a0Var.f2199a) && this.b.equals(b9a0Var.b) && this.c == b9a0Var.c && this.d.equals(b9a0Var.d) && Intrinsics.d(this.e, b9a0Var.e) && this.f.equals(b9a0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(twn.a(this.c, ua80.b(this.f2199a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PlayerModel(id=", this.f2199a, ", name=", this.b, ", translationId=");
        kng0.w(this.c, ", shortName=", this.d, ", country=", sbN);
        sbN.append(this.e);
        sbN.append(", image=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
