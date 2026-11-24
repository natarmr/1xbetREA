package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class azc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f1710a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public azc0(pz40 pz40Var, String str, String str2, boolean z, boolean z2, boolean z3) {
        pz40Var.getClass();
        str.getClass();
        this.f1710a = pz40Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static azc0 a(azc0 azc0Var, pz40 pz40Var, boolean z, int i) {
        if ((i & 1) != 0) {
            pz40Var = azc0Var.f1710a;
        }
        pz40 pz40Var2 = pz40Var;
        String str = azc0Var.b;
        String str2 = azc0Var.c;
        boolean z2 = azc0Var.d;
        boolean z3 = azc0Var.f;
        pz40Var2.getClass();
        str.getClass();
        return new azc0(pz40Var2, str, str2, z2, z, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azc0)) {
            return false;
        }
        azc0 azc0Var = (azc0) obj;
        return Intrinsics.d(this.f1710a, azc0Var.f1710a) && Intrinsics.d(this.b, azc0Var.b) && Intrinsics.d(this.c, azc0Var.c) && this.d == azc0Var.d && this.e == azc0Var.e && this.f == azc0Var.f;
    }

    public final int hashCode() {
        int iB = ua80.b(this.f1710a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.f) + brm0.e(brm0.e((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromocodeFieldUiState(promocodeValue=");
        sb.append(this.f1710a);
        sb.append(", promocodeValuePlaceholder=");
        sb.append(this.b);
        sb.append(", promocodeSupportingText=");
        brm0.C(this.c, ", isVisibleActionButton=", ", isActivatedButton=", sb, this.d);
        return ohs0.p(", isVisibleBadge=", Separators.RPAREN, sb, this.e, this.f);
    }
}
