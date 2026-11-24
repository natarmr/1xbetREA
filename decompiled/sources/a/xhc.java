package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xhc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f40883a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public xhc(a4x a4xVar, String str, String str2, boolean z, boolean z2, boolean z3) {
        a4xVar.getClass();
        str.getClass();
        str2.getClass();
        this.f40883a = a4xVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhc)) {
            return false;
        }
        xhc xhcVar = (xhc) obj;
        return Intrinsics.d(this.f40883a, xhcVar.f40883a) && Intrinsics.d(this.b, xhcVar.b) && Intrinsics.d(this.c, xhcVar.c) && this.d == xhcVar.d && this.e == xhcVar.e && this.f == xhcVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(ua80.b(ua80.b(this.f40883a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseLossLimitEeUiState(moneyLimitAvailableValues=");
        sb.append(this.f40883a);
        sb.append(", enteredLimitValue=");
        sb.append(this.b);
        sb.append(", currency=");
        brm0.C(this.c, ", hasFreeValue=", ", isSaveButtonEnabled=", sb, this.d);
        return ohs0.p(", isLoading=", Separators.RPAREN, sb, this.e, this.f);
    }
}
