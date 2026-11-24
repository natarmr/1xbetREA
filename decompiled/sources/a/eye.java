package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class eye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ss10 f8624a;
    public final String b;
    public final k680 c;
    public final boolean d;

    public eye(ss10 ss10Var, String str, k680 k680Var, boolean z) {
        this.f8624a = ss10Var;
        this.b = str;
        this.c = k680Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eye)) {
            return false;
        }
        eye eyeVar = (eye) obj;
        return this.f8624a.equals(eyeVar.f8624a) && this.b.equals(eyeVar.b) && Intrinsics.d(this.c, eyeVar.c) && this.d == eyeVar.d;
    }

    public final int hashCode() {
        int iB = ua80.b(this.f8624a.hashCode() * 31, 31, this.b);
        k680 k680Var = this.c;
        return Boolean.hashCode(this.d) + ((iB + (k680Var == null ? 0 : k680Var.hashCode())) * 31);
    }

    public final String toString() {
        return "CouponInfoUiModel(mainContainerUiState=" + this.f8624a + ", coefChangeDesc=" + this.b + ", optionBetUiState=" + this.c + ", isAutoSub=" + this.d + Separators.RPAREN;
    }
}
