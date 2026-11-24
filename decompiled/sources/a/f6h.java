package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f6h implements n6h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eu6 f9009a;

    public f6h(eu6 eu6Var) {
        this.f9009a = eu6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6h) && this.f9009a == ((f6h) obj).f9009a;
    }

    public final int hashCode() {
        return this.f9009a.hashCode();
    }

    public final String toString() {
        return "OnBetLongClick(params=" + this.f9009a + Separators.RPAREN;
    }
}
