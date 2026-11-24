package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zn1 implements ao1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44651a;
    public final String b;
    public final String c;

    public zn1(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f44651a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn1)) {
            return false;
        }
        zn1 zn1Var = (zn1) obj;
        return Intrinsics.d(this.f44651a, zn1Var.f44651a) && Intrinsics.d(this.b, zn1Var.b) && Intrinsics.d(this.c, zn1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f44651a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ShowFavoritesErrorDialog(title=", this.f44651a, ", message=", this.b, ", buttonText="), this.c, Separators.RPAREN);
    }
}
