package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bzc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f3460a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public bzc0(pz40 pz40Var, String str, boolean z, boolean z2) {
        pz40Var.getClass();
        str.getClass();
        this.f3460a = pz40Var;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzc0)) {
            return false;
        }
        bzc0 bzc0Var = (bzc0) obj;
        return Intrinsics.d(this.f3460a, bzc0Var.f3460a) && Intrinsics.d(this.b, bzc0Var.b) && this.c == bzc0Var.c && this.d == bzc0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f3460a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromocodeFieldUiState(promocodeValue=");
        sb.append(this.f3460a);
        sb.append(", promocodeValuePlaceholder=");
        sb.append(this.b);
        sb.append(", isVisibleActionButton=");
        return ohs0.p(", isActivatedButton=", Separators.RPAREN, sb, this.c, this.d);
    }
}
