package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class mh10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21768a;
    public final int b;
    public final boolean c;
    public final a4x d;

    public mh10(int i, a4x a4xVar, String str, boolean z) {
        str.getClass();
        a4xVar.getClass();
        this.f21768a = str;
        this.b = i;
        this.c = z;
        this.d = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh10)) {
            return false;
        }
        mh10 mh10Var = (mh10) obj;
        return Intrinsics.d(this.f21768a, mh10Var.f21768a) && this.b == mh10Var.b && this.c == mh10Var.c && Intrinsics.d(this.d, mh10Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(twn.a(this.b, this.f21768a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "LoyaltyProgramBasicUiState(title=", this.f21768a, ", launchPage=", ", operationProgress=");
        sbP.append(this.c);
        sbP.append(", pages=");
        sbP.append(this.d);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
