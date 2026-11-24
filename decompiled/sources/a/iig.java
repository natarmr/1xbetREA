package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iig implements jig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14827a;
    public final h2l0 b;

    public iig(long j, h2l0 h2l0Var) {
        this.f14827a = j;
        this.b = h2l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iig)) {
            return false;
        }
        iig iigVar = (iig) obj;
        return this.f14827a == iigVar.f14827a && this.b == iigVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f14827a) * 31);
    }

    public final String toString() {
        return "OnRightPartClick(champId=" + this.f14827a + ", clickModel=" + this.b + Separators.RPAREN;
    }
}
