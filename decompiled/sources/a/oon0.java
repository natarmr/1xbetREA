package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oon0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25603a;
    public final String b;
    public final String c;
    public final yvl d;
    public final wul e;
    public final wul f;

    public oon0(String str, String str2, String str3, yvl yvlVar, wul wulVar, wul wulVar2) {
        brm0.B(str, str2, str3);
        this.f25603a = str;
        this.b = str2;
        this.c = str3;
        this.d = yvlVar;
        this.e = wulVar;
        this.f = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oon0)) {
            return false;
        }
        oon0 oon0Var = (oon0) obj;
        return Intrinsics.d(this.f25603a, oon0Var.f25603a) && Intrinsics.d(this.b, oon0Var.b) && Intrinsics.d(this.c, oon0Var.c) && this.d.equals(oon0Var.d) && this.e.equals(oon0Var.e) && this.f.equals(oon0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + i8i.a(this.e, (this.d.hashCode() + ua80.b(ua80.b(this.f25603a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SwipeActionConfirmationBottomSheetUiModel(title=", this.f25603a, ", subTitle=", this.b, ", doNotAskAgainTitle=");
        sbN.append(this.c);
        sbN.append(", doNotAskAgainChecker=");
        sbN.append(this.d);
        sbN.append(", positiveButton=");
        sbN.append(this.e);
        sbN.append(", negativeButton=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
