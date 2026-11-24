package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class rep0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30347a;
    public final String b;
    public final String c;
    public final int d;

    public rep0(String str, String str2, String str3, int i) {
        str2.getClass();
        str3.getClass();
        this.f30347a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rep0)) {
            return false;
        }
        rep0 rep0Var = (rep0) obj;
        return this.f30347a.equals(rep0Var.f30347a) && Intrinsics.d(this.b, rep0Var.b) && Intrinsics.d(this.c, rep0Var.c) && this.d == rep0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ua80.b(ua80.b(this.f30347a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return brm0.j(this.d, this.c, ", sideIcon=", Separators.RPAREN, b1j.n("TeamInfoUiModel(image=", this.f30347a, ", name=", this.b, ", sideTitle="));
    }
}
