package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class llr0 implements plr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f20263a;

    public llr0(ra10 ra10Var) {
        this.f20263a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof llr0) && this.f20263a.equals(((llr0) obj).f20263a);
    }

    public final int hashCode() {
        return this.f20263a.hashCode();
    }

    public final String toString() {
        return h97.k("Empty(lottieConfig=", this.f20263a, Separators.RPAREN);
    }
}
