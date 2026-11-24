package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g8a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10856a;
    public final String b;
    public final String c;

    public g8a0(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f10856a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8a0)) {
            return false;
        }
        g8a0 g8a0Var = (g8a0) obj;
        return Intrinsics.d(this.f10856a, g8a0Var.f10856a) && Intrinsics.d(this.b, g8a0Var.b) && Intrinsics.d(this.c, g8a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f10856a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("PlayerMenuItemUiModel(id=", this.f10856a, ", name=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
