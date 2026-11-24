package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pk30 extends sk30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f27118a;

    public pk30(jkm jkmVar) {
        this.f27118a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pk30) && this.f27118a.equals(((pk30) obj).f27118a);
    }

    public final int hashCode() {
        return this.f27118a.hashCode();
    }

    public final String toString() {
        return twn.o("Empty(lottieConfig=", this.f27118a, Separators.RPAREN);
    }
}
