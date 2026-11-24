package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class arh0 implements crh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f1347a;

    public arh0(jkm jkmVar) {
        this.f1347a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof arh0) && this.f1347a.equals(((arh0) obj).f1347a);
    }

    public final int hashCode() {
        return this.f1347a.hashCode();
    }

    public final String toString() {
        return twn.o("Error(lottieConfig=", this.f1347a, Separators.RPAREN);
    }
}
