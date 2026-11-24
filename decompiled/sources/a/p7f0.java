package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p7f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26503a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final wul e;
    public final wul f;
    public final wul g;

    public p7f0(String str, String str2, boolean z, boolean z2, wul wulVar, wul wulVar2, wul wulVar3) {
        str.getClass();
        str2.getClass();
        this.f26503a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = wulVar;
        this.f = wulVar2;
        this.g = wulVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7f0)) {
            return false;
        }
        p7f0 p7f0Var = (p7f0) obj;
        return Intrinsics.d(this.f26503a, p7f0Var.f26503a) && Intrinsics.d(this.b, p7f0Var.b) && this.c == p7f0Var.c && this.d == p7f0Var.d && this.e.equals(p7f0Var.e) && this.f.equals(p7f0Var.f) && this.g.equals(p7f0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + i8i.a(this.f, i8i.a(this.e, brm0.e(brm0.e(ua80.b(this.f26503a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RegistrationSuccessUiState(login=", this.f26503a, ", password=", this.b, ", isLoading=");
        ua80.u(", isContentVisible=", ", copyButtonUiModel=", sbN, this.c, this.d);
        sbN.append(this.e);
        sbN.append(", shareButtonUiModel=");
        sbN.append(this.f);
        sbN.append(", nextButtonUiModel=");
        sbN.append(this.g);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
