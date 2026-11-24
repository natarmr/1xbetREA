package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qk30 extends sk30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f28867a;

    public qk30(jkm jkmVar) {
        this.f28867a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qk30) && this.f28867a.equals(((qk30) obj).f28867a);
    }

    public final int hashCode() {
        return this.f28867a.hashCode();
    }

    public final String toString() {
        return twn.o("Error(lottieConfig=", this.f28867a, Separators.RPAREN);
    }
}
