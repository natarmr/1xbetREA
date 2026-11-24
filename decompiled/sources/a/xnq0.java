package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xnq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41181a;
    public final String b;
    public final String c;
    public final String d;

    public xnq0(String str, String str2, String str3, String str4) {
        brm0.B(str2, str3, str4);
        this.f41181a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnq0)) {
            return false;
        }
        xnq0 xnq0Var = (xnq0) obj;
        return Intrinsics.d(this.f41181a, xnq0Var.f41181a) && Intrinsics.d(this.b, xnq0Var.b) && Intrinsics.d(this.c, xnq0Var.c) && Intrinsics.d(this.d, xnq0Var.d);
    }

    public final int hashCode() {
        String str = this.f41181a;
        return this.d.hashCode() + ua80.b(ua80.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("TimerUiState(days=", this.f41181a, ", hours=", this.b, ", minutes="), this.c, ", seconds=", this.d, Separators.RPAREN);
    }
}
