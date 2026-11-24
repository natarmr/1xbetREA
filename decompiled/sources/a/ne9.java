package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ne9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23374a;
    public final String b;
    public final String c;

    public ne9(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f23374a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne9)) {
            return false;
        }
        ne9 ne9Var = (ne9) obj;
        return Intrinsics.d(this.f23374a, ne9Var.f23374a) && Intrinsics.d(this.b, ne9Var.b) && Intrinsics.d(this.c, ne9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f23374a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ButtonModel(id=", this.f23374a, ", type=", this.b, ", text="), this.c, Separators.RPAREN);
    }
}
