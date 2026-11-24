package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ui60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f35716a;
    public final a4x b;
    public final a4x c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final uaq0 i;

    public ui60(a4x a4xVar, a4x a4xVar2, a4x a4xVar3, int i, int i2, String str, String str2, String str3, uaq0 uaq0Var) {
        a4xVar.getClass();
        a4xVar2.getClass();
        a4xVar3.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f35716a = a4xVar;
        this.b = a4xVar2;
        this.c = a4xVar3;
        this.d = i;
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = uaq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui60)) {
            return false;
        }
        ui60 ui60Var = (ui60) obj;
        return Intrinsics.d(this.f35716a, ui60Var.f35716a) && Intrinsics.d(this.b, ui60Var.b) && Intrinsics.d(this.c, ui60Var.c) && this.d == ui60Var.d && this.e == ui60Var.e && Intrinsics.d(this.f, ui60Var.f) && Intrinsics.d(this.g, ui60Var.g) && Intrinsics.d(this.h, ui60Var.h) && this.i == ui60Var.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(ua80.b(ua80.b(twn.a(this.e, twn.a(this.d, cs0.b(this.c, cs0.b(this.b, this.f35716a.hashCode() * 31, 31), 31), 31), 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("OnboardingBottomSheetUiModel(images=", this.f35716a, ", titles=", this.b, ", descriptions=");
        sbQ.append(this.c);
        sbQ.append(", initialPage=");
        sbQ.append(this.d);
        sbQ.append(", currentPage=");
        kng0.w(this.e, ", acceptButtonTitle=", this.f, ", skipButtonLabel=", sbQ);
        f140.v(sbQ, this.g, ", nextButtonLabel=", this.h, ", theme=");
        sbQ.append(this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
