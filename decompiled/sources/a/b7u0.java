package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b7u0 extends d7u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f2126a;

    public b7u0(jkm jkmVar) {
        this.f2126a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b7u0) && this.f2126a.equals(((b7u0) obj).f2126a);
    }

    public final int hashCode() {
        return this.f2126a.hashCode();
    }

    public final String toString() {
        return twn.o("Error(lottieConfig=", this.f2126a, Separators.RPAREN);
    }
}
