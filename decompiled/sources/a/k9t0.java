package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k9t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17931a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;

    public k9t0(int i, int i2, int i3, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f17931a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9t0)) {
            return false;
        }
        k9t0 k9t0Var = (k9t0) obj;
        return Intrinsics.d(this.f17931a, k9t0Var.f17931a) && Intrinsics.d(this.b, k9t0Var.b) && this.c == k9t0Var.c && this.d == k9t0Var.d && this.e == k9t0Var.e && this.f.equals(k9t0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(this.e, twn.a(this.d, twn.a(this.c, ua80.b(this.f17931a.hashCode() * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("UniversalChampGroupStageTeamUiModel(name=", this.f17931a, ", image=", this.b, ", wins=");
        axq.r(this.c, this.d, ", loses=", ", winrate=", sbN);
        return rw2.k(this.e, ", winrateString=", this.f, Separators.RPAREN, sbN);
    }
}
