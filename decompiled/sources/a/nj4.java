package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nj4 implements sj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23616a;
    public final String b;
    public final boolean c;

    public nj4(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f23616a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj4)) {
            return false;
        }
        nj4 nj4Var = (nj4) obj;
        return Intrinsics.d(this.f23616a, nj4Var.f23616a) && Intrinsics.d(this.b, nj4Var.b) && this.c == nj4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f23616a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("ShowAuthErrorDialog(title=", this.f23616a, ", message=", this.b, ", isConsultantAvailable="), this.c, Separators.RPAREN);
    }
}
