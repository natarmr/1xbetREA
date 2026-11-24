package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zyc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f45200a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public zyc0(pz40 pz40Var, String str, String str2, boolean z, boolean z2, boolean z3) {
        pz40Var.getClass();
        str.getClass();
        this.f45200a = pz40Var;
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
        if (!(obj instanceof zyc0)) {
            return false;
        }
        zyc0 zyc0Var = (zyc0) obj;
        return Intrinsics.d(this.f45200a, zyc0Var.f45200a) && Intrinsics.d(this.b, zyc0Var.b) && Intrinsics.d(this.c, zyc0Var.c) && this.d == zyc0Var.d && this.e == zyc0Var.e && this.f == zyc0Var.f;
    }

    public final int hashCode() {
        int iB = ua80.b(this.f45200a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.f) + brm0.e(brm0.e((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromocodeFieldUiState(promocodeValue=");
        sb.append(this.f45200a);
        sb.append(", promocodeValuePlaceholder=");
        sb.append(this.b);
        sb.append(", promocodeSupportingText=");
        brm0.C(this.c, ", isVisibleActionButton=", ", isActivatedButton=", sb, this.d);
        return ohs0.p(", isVisibleBadge=", Separators.RPAREN, sb, this.e, this.f);
    }
}
