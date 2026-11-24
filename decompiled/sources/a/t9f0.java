package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33560a;
    public final String b;
    public final String c;
    public final boolean d;
    public final a4x e;

    public t9f0(String str, String str2, String str3, boolean z, a4x a4xVar) {
        w6x.x(a4xVar, str, str3);
        this.f33560a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9f0)) {
            return false;
        }
        t9f0 t9f0Var = (t9f0) obj;
        return Intrinsics.d(this.f33560a, t9f0Var.f33560a) && this.b.equals(t9f0Var.b) && Intrinsics.d(this.c, t9f0Var.c) && this.d == t9f0Var.d && Intrinsics.d(this.e, t9f0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(ua80.b(ua80.b(this.f33560a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RegistrationVisualAppBarUiModel(title=", this.f33560a, ", subtitle=", this.b, ", appBarBackgroundImage=");
        brm0.C(this.c, ", isRegistrationTypesSelectorEnable=", ", registrationTypeDsChipModels=", sbN, this.d);
        return cs0.n(sbN, this.e, Separators.RPAREN);
    }
}
