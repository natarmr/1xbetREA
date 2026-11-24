package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ubs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbs0 f35397a;
    public final String b;

    public ubs0(tbs0 tbs0Var, String str) {
        str.getClass();
        this.f35397a = tbs0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubs0)) {
            return false;
        }
        ubs0 ubs0Var = (ubs0) obj;
        return this.f35397a == ubs0Var.f35397a && Intrinsics.d(this.b, ubs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35397a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackCouponInteractionUiModel(trackButtonState=" + this.f35397a + ", trackButtonText=" + this.b + Separators.RPAREN;
    }
}
