package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nk5 implements pk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f23666a;

    public nk5(jkm jkmVar) {
        this.f23666a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nk5) && this.f23666a.equals(((nk5) obj).f23666a);
    }

    public final int hashCode() {
        return this.f23666a.hashCode();
    }

    public final String toString() {
        return twn.o("Error(lottieConfig=", this.f23666a, Separators.RPAREN);
    }
}
