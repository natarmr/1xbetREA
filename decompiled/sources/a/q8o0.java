package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q8o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28310a;
    public final String b;
    public final String c;

    public q8o0(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f28310a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8o0)) {
            return false;
        }
        q8o0 q8o0Var = (q8o0) obj;
        return Intrinsics.d(this.f28310a, q8o0Var.f28310a) && Intrinsics.d(this.b, q8o0Var.b) && Intrinsics.d(this.c, q8o0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f28310a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("SyntheticUfcHeaderUiModel(typeOfWinHeader=", this.f28310a, ", winnerHeader=", this.b, ", timeHeader="), this.c, Separators.RPAREN);
    }
}
