package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m9k implements o9k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f21413a;

    public m9k(ra10 ra10Var) {
        ra10Var.getClass();
        this.f21413a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m9k) && Intrinsics.d(this.f21413a, ((m9k) obj).f21413a);
    }

    public final int hashCode() {
        return this.f21413a.hashCode();
    }

    public final String toString() {
        return h97.k("ShowError(lottieConfig=", this.f21413a, Separators.RPAREN);
    }
}
