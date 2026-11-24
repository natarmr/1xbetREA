package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class tf4 implements yf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33849a;
    public final String b;
    public final boolean c;

    public tf4(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f33849a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf4)) {
            return false;
        }
        tf4 tf4Var = (tf4) obj;
        return Intrinsics.d(this.f33849a, tf4Var.f33849a) && Intrinsics.d(this.b, tf4Var.b) && this.c == tf4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f33849a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("ShowAuthErrorDialog(title=", this.f33849a, ", message=", this.b, ", isConsultantAvailable="), this.c, Separators.RPAREN);
    }
}
