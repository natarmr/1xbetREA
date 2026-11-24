package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ps60 {
    public static final os60 Companion = new os60();
    public static final a8z[] g = {null, null, null, null, null, maz.a(wez.f39042a, new fq60(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27500a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final Set f;

    public /* synthetic */ ps60(int i, int i2, String str, int i3, int i4, int i5, Set set) {
        if (63 != (i & 63)) {
            m2x.I(i, 63, ns60.f24039a.getDescriptor());
            throw null;
        }
        this.f27500a = i2;
        this.b = str;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps60)) {
            return false;
        }
        ps60 ps60Var = (ps60) obj;
        return this.f27500a == ps60Var.f27500a && Intrinsics.d(this.b, ps60Var.b) && this.c == ps60Var.c && this.d == ps60Var.d && this.e == ps60Var.e && Intrinsics.d(this.f, ps60Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(this.e, twn.a(this.d, twn.a(this.c, ua80.b(Integer.hashCode(this.f27500a) * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f27500a, "OneXGamesByGameIdsNotAuthRequest(whence=", ", language=", this.b, ", refId=");
        axq.r(this.c, this.d, ", groupId=", ", countryId=", sbR);
        sbR.append(this.e);
        sbR.append(", gameIdSet=");
        sbR.append(this.f);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }

    public ps60(String str, int i, Set set) {
        set.getClass();
        this.f27500a = 22;
        this.b = str;
        this.c = 1;
        this.d = 1357;
        this.e = i;
        this.f = set;
    }
}
