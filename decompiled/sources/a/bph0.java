package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bph0 implements dph0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f2984a;

    public bph0(jkm jkmVar) {
        this.f2984a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bph0) && this.f2984a.equals(((bph0) obj).f2984a);
    }

    public final int hashCode() {
        return this.f2984a.hashCode();
    }

    public final String toString() {
        return twn.o("Error(lottieConfig=", this.f2984a, Separators.RPAREN);
    }
}
