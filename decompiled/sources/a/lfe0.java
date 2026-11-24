package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lfe0 implements mfe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19952a;
    public final String b;
    public final String c;

    public lfe0(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f19952a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfe0)) {
            return false;
        }
        lfe0 lfe0Var = (lfe0) obj;
        return Intrinsics.d(this.f19952a, lfe0Var.f19952a) && Intrinsics.d(this.b, lfe0Var.b) && Intrinsics.d(this.c, lfe0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f19952a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ShowFavoriteLimitDialog(title=", this.f19952a, ", message=", this.b, ", buttonText="), this.c, Separators.RPAREN);
    }
}
