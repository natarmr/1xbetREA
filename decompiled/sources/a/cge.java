package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cge implements jge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha8 f4307a;

    public cge(ha8 ha8Var) {
        this.f4307a = ha8Var;
    }

    @Override // a.jge
    public final ha8 a() {
        return this.f4307a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cge) && this.f4307a.equals(((cge) obj).f4307a);
    }

    public final int hashCode() {
        return this.f4307a.hashCode();
    }

    public final String toString() {
        return "LoyaltyWidget(blockState=" + this.f4307a + Separators.RPAREN;
    }
}
