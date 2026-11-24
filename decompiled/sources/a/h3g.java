package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class h3g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12383a;
    public final w2g b;
    public final boolean c;
    public final boolean d;

    public h3g(boolean z, w2g w2gVar, boolean z2, boolean z3) {
        this.f12383a = z;
        this.b = w2gVar;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3g)) {
            return false;
        }
        h3g h3gVar = (h3g) obj;
        return this.f12383a == h3gVar.f12383a && this.b == h3gVar.b && this.c == h3gVar.c && this.d == h3gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e((this.b.hashCode() + (Boolean.hashCode(this.f12383a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberBottomSheetUiState(idleAnimationEnabled=");
        sb.append(this.f12383a);
        sb.append(", contentKind=");
        sb.append(this.b);
        sb.append(", hasBroadcast=");
        return ohs0.p(", gameFinished=", Separators.RPAREN, sb, this.c, this.d);
    }
}
