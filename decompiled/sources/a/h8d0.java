package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h8d0 implements i8d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12620a;
    public final String b;
    public final String c;

    public h8d0(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f12620a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8d0)) {
            return false;
        }
        h8d0 h8d0Var = (h8d0) obj;
        return Intrinsics.d(this.f12620a, h8d0Var.f12620a) && Intrinsics.d(this.b, h8d0Var.b) && Intrinsics.d(this.c, h8d0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f12620a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ShowFavoritesErrorDialog(title=", this.f12620a, ", message=", this.b, ", buttonText="), this.c, Separators.RPAREN);
    }
}
