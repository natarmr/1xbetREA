package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class g3g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jlr f10609a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public g3g(jlr jlrVar, boolean z, boolean z2, boolean z3) {
        this.f10609a = jlrVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static g3g a(g3g g3gVar, jlr jlrVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            jlrVar = g3gVar.f10609a;
        }
        if ((i & 2) != 0) {
            z = g3gVar.b;
        }
        if ((i & 4) != 0) {
            z2 = g3gVar.c;
        }
        boolean z3 = (i & 8) != 0 ? g3gVar.d : true;
        g3gVar.getClass();
        jlrVar.getClass();
        return new g3g(jlrVar, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3g)) {
            return false;
        }
        g3g g3gVar = (g3g) obj;
        return this.f10609a.equals(g3gVar.f10609a) && this.b == g3gVar.b && this.c == g3gVar.c && this.d == g3gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(this.f10609a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberBottomSheetState(game=");
        sb.append(this.f10609a);
        sb.append(", hasMarkets=");
        sb.append(this.b);
        sb.append(", hasBroadcast=");
        return ohs0.p(", idleAnimationInterrupted=", Separators.RPAREN, sb, this.c, this.d);
    }
}
