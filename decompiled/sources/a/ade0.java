package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ade0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f676a;
    public final String b;
    public final boolean c;
    public final String d;
    public final imm e;
    public final mtl f;

    public ade0(String str, String str2, boolean z, String str3, imm immVar, mtl mtlVar) {
        brm0.B(str, str2, str3);
        this.f676a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = immVar;
        this.f = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ade0)) {
            return false;
        }
        ade0 ade0Var = (ade0) obj;
        return Intrinsics.d(this.f676a, ade0Var.f676a) && Intrinsics.d(this.b, ade0Var.b) && this.c == ade0Var.c && Intrinsics.d(this.d, ade0Var.d) && this.e.equals(ade0Var.e) && this.f.equals(ade0Var.f);
    }

    public final int hashCode() {
        return this.f.f22376a.hashCode() + h97.a(this.e, ua80.b(brm0.e(ua80.b(this.f676a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RealityLimitLockScreenUiState(title=", this.f676a, ", subtitle=", this.b, ", dontRemind=");
        f140.s(", dontRemindText=", this.d, ", navigationBarUiModel=", sbN, this.c);
        sbN.append(this.e);
        sbN.append(", bottomBarModel=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
