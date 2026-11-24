package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gqq0 implements hqq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f11745a;

    public /* synthetic */ gqq0(ra10 ra10Var) {
        this.f11745a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gqq0) {
            return this.f11745a.equals(((gqq0) obj).f11745a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11745a.hashCode();
    }

    public final String toString() {
        return h97.k("Lottie(lottieConfig=", this.f11745a, Separators.RPAREN);
    }
}
