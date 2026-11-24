package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class jn0 implements kn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16790a;
    public final String b;
    public final String c;

    public jn0(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f16790a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn0)) {
            return false;
        }
        jn0 jn0Var = (jn0) obj;
        return Intrinsics.d(this.f16790a, jn0Var.f16790a) && Intrinsics.d(this.b, jn0Var.b) && Intrinsics.d(this.c, jn0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f16790a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ShowFavoritesErrorDialog(title=", this.f16790a, ", message=", this.b, ", buttonText="), this.c, Separators.RPAREN);
    }
}
