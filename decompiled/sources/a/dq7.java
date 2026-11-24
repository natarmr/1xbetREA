package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dq7 extends eq7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6500a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final v5l0 f;

    public dq7(String str, String str2, int i, String str3, boolean z, v5l0 v5l0Var) {
        brm0.B(str, str2, str3);
        this.f6500a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = z;
        this.f = v5l0Var;
    }

    @Override // a.eq7
    public final String a() {
        return this.f6500a;
    }

    @Override // a.eq7
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq7)) {
            return false;
        }
        dq7 dq7Var = (dq7) obj;
        return Intrinsics.d(this.f6500a, dq7Var.f6500a) && Intrinsics.d(this.b, dq7Var.b) && this.c == dq7Var.c && Intrinsics.d(this.d, dq7Var.d) && this.e == dq7Var.e && this.f == dq7Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(ua80.b(twn.a(this.c, ua80.b(this.f6500a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Loading(imgUrl=", this.f6500a, ", title=", this.b, ", lotteryId=");
        kng0.w(this.c, ", bannerId=", this.d, ", expanded=", sbN);
        sbN.append(this.e);
        sbN.append(", sportEventCardStyle=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
