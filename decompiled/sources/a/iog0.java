package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iog0 implements kog0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f15116a;

    public iog0(jkm jkmVar) {
        this.f15116a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iog0) && this.f15116a.equals(((iog0) obj).f15116a);
    }

    public final int hashCode() {
        return this.f15116a.hashCode();
    }

    public final String toString() {
        return twn.o("ShowErrorAnimation(lottieConfig=", this.f15116a, Separators.RPAREN);
    }
}
