package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rlp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30709a;
    public final boolean b;
    public final i8l0 c;
    public final j8l0 d;
    public final g8l0 e;
    public final boolean f;

    public rlp(boolean z, boolean z2, i8l0 i8l0Var, j8l0 j8l0Var, g8l0 g8l0Var, boolean z3) {
        this.f30709a = z;
        this.b = z2;
        this.c = i8l0Var;
        this.d = j8l0Var;
        this.e = g8l0Var;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlp)) {
            return false;
        }
        rlp rlpVar = (rlp) obj;
        return this.f30709a == rlpVar.f30709a && this.b == rlpVar.b && this.c == rlpVar.c && this.d == rlpVar.d && this.e == rlpVar.e && this.f == rlpVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + brm0.e(Boolean.hashCode(this.f30709a) * 31, 31, this.b)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("FeedsChampsConfig(bettingDisabled=", ", isNewEventParams=", ", iconStylePath=", this.f30709a, this.b);
        sbQ.append(this.c);
        sbQ.append(", listStyle=");
        sbQ.append(this.d);
        sbQ.append(", filterStyle=");
        sbQ.append(this.e);
        sbQ.append(", supportRtl=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
