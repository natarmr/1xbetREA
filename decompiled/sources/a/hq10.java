package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hq10 implements kq10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f13466a;

    public hq10(jkm jkmVar) {
        this.f13466a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hq10) && this.f13466a.equals(((hq10) obj).f13466a);
    }

    public final int hashCode() {
        return this.f13466a.hashCode();
    }

    public final String toString() {
        return twn.o("Error(lottieConfig=", this.f13466a, Separators.RPAREN);
    }
}
