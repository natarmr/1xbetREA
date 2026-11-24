package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class o11 implements p11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24455a;
    public final String b;
    public final String c;

    public o11(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f24455a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o11)) {
            return false;
        }
        o11 o11Var = (o11) obj;
        return Intrinsics.d(this.f24455a, o11Var.f24455a) && Intrinsics.d(this.b, o11Var.b) && Intrinsics.d(this.c, o11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f24455a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ShowFavoritesErrorDialog(title=", this.f24455a, ", message=", this.b, ", buttonText="), this.c, Separators.RPAREN);
    }
}
