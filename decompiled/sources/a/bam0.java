package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bam0 implements cam0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f2266a;

    public bam0(jkm jkmVar) {
        this.f2266a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bam0) && this.f2266a.equals(((bam0) obj).f2266a);
    }

    public final int hashCode() {
        return this.f2266a.hashCode();
    }

    public final String toString() {
        return twn.o("Error(lottieConfig=", this.f2266a, Separators.RPAREN);
    }
}
