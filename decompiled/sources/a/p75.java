package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p75 implements r75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26490a;
    public final String b;
    public final String c;

    public p75(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f26490a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p75)) {
            return false;
        }
        p75 p75Var = (p75) obj;
        return Intrinsics.d(this.f26490a, p75Var.f26490a) && Intrinsics.d(this.b, p75Var.b) && Intrinsics.d(this.c, p75Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f26490a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ShowFavoritesErrorDialog(title=", this.f26490a, ", message=", this.b, ", buttonText="), this.c, Separators.RPAREN);
    }
}
