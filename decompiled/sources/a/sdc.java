package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sdc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32027a;
    public final String b;
    public final a4x c;
    public final x6q0 d;
    public final boolean e;
    public final boolean f;

    public sdc(String str, String str2, i4 i4Var, x6q0 x6q0Var, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        i4Var.getClass();
        this.f32027a = str;
        this.b = str2;
        this.c = i4Var;
        this.d = x6q0Var;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdc)) {
            return false;
        }
        sdc sdcVar = (sdc) obj;
        return Intrinsics.d(this.f32027a, sdcVar.f32027a) && Intrinsics.d(this.b, sdcVar.b) && Intrinsics.d(this.c, sdcVar.c) && Intrinsics.d(this.d, sdcVar.d) && this.e == sdcVar.e && this.f == sdcVar.f;
    }

    public final int hashCode() {
        int iB = cs0.b(this.c, ua80.b(this.f32027a.hashCode() * 31, 31, this.b), 31);
        x6q0 x6q0Var = this.d;
        return Boolean.hashCode(this.f) + brm0.e((iB + (x6q0Var == null ? 0 : x6q0Var.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ChoiceNewLimitNeUiState(toolbarTitle=", this.f32027a, ", headerText=", this.b, ", availableValues=");
        sbN.append(this.c);
        sbN.append(", textFieldMultilineBasicUiModel=");
        sbN.append(this.d);
        sbN.append(", bottomButtonEnabled=");
        return ohs0.p(", isLoading=", Separators.RPAREN, sbN, this.e, this.f);
    }
}
