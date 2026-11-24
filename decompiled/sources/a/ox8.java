package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ox8 implements px8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25999a;
    public final String b;
    public final String c;

    public ox8(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f25999a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox8)) {
            return false;
        }
        ox8 ox8Var = (ox8) obj;
        return Intrinsics.d(this.f25999a, ox8Var.f25999a) && Intrinsics.d(this.b, ox8Var.b) && Intrinsics.d(this.c, ox8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f25999a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ShowFavoritesErrorDialog(title=", this.f25999a, ", message=", this.b, ", buttonText="), this.c, Separators.RPAREN);
    }
}
