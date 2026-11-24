package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pd7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26794a;
    public final String b;
    public final ank0 c;
    public final boolean d;
    public final boolean e;

    public pd7(boolean z, String str, ank0 ank0Var, boolean z2, boolean z3) {
        str.getClass();
        this.f26794a = z;
        this.b = str;
        this.c = ank0Var;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd7)) {
            return false;
        }
        pd7 pd7Var = (pd7) obj;
        return this.f26794a == pd7Var.f26794a && Intrinsics.d(this.b, pd7Var.b) && this.c.equals(pd7Var.c) && this.d == pd7Var.d && this.e == pd7Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(dw9.a(ua80.b(Boolean.hashCode(this.f26794a) * 31, 31, this.b), 31, this.c.f1159a), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("BetInputUiStateModel(isLoading=", ", currentSum=", this.b, this.f26794a, ", limitRangeSpannableModel=");
        sbQ.append(this.c);
        sbQ.append(", isActiveActionButton=");
        sbQ.append(this.d);
        sbQ.append(", isError=");
        return rw2.p(sbQ, this.e, Separators.RPAREN);
    }
}
