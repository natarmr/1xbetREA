package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class fom0 {
    public static final eom0 Companion = new eom0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nnm0 f9889a;
    public final String b;

    public /* synthetic */ fom0(int i, nnm0 nnm0Var, String str) {
        if ((i & 1) == 0) {
            this.f9889a = null;
        } else {
            this.f9889a = nnm0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fom0)) {
            return false;
        }
        fom0 fom0Var = (fom0) obj;
        return this.f9889a == fom0Var.f9889a && Intrinsics.d(this.b, fom0Var.b);
    }

    public final int hashCode() {
        nnm0 nnm0Var = this.f9889a;
        int iHashCode = (nnm0Var == null ? 0 : nnm0Var.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "StatusResponse(statusBonus=" + this.f9889a + ", description=" + this.b + Separators.RPAREN;
    }
}
