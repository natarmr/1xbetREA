package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class non0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23876a;
    public final yvl b;

    public non0(String str, yvl yvlVar) {
        str.getClass();
        this.f23876a = str;
        this.b = yvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof non0)) {
            return false;
        }
        non0 non0Var = (non0) obj;
        return Intrinsics.d(this.f23876a, non0Var.f23876a) && this.b.equals(non0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23876a.hashCode() * 31);
    }

    public final String toString() {
        return "SwipeActionConfirmationBottomSheetState(requestKey=" + this.f23876a + ", doNotAskAgainChecker=" + this.b + Separators.RPAREN;
    }
}
