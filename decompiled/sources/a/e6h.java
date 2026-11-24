package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e6h implements n6h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eu6 f7283a;

    public e6h(eu6 eu6Var) {
        this.f7283a = eu6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e6h) && this.f7283a == ((e6h) obj).f7283a;
    }

    public final int hashCode() {
        return this.f7283a.hashCode();
    }

    public final String toString() {
        return "OnBetClick(params=" + this.f7283a + Separators.RPAREN;
    }
}
