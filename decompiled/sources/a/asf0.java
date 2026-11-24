package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class asf0 {
    public static final zrf0 Companion = new zrf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1390a;
    public final String b;
    public final Double c;
    public final long d;
    public final bg8 e;

    public /* synthetic */ asf0(int i, int i2, String str, Double d, long j, bg8 bg8Var) {
        if (11 != (i & 11)) {
            m2x.I(i, 11, yrf0.f43119a.getDescriptor());
            throw null;
        }
        this.f1390a = i2;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        this.d = j;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bg8Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asf0)) {
            return false;
        }
        asf0 asf0Var = (asf0) obj;
        return this.f1390a == asf0Var.f1390a && Intrinsics.d(this.b, asf0Var.b) && Intrinsics.d(this.c, asf0Var.c) && this.d == asf0Var.d && Intrinsics.d(this.e, asf0Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(Integer.hashCode(this.f1390a) * 31, 31, this.b);
        Double d = this.c;
        int iB2 = rw2.b((iB + (d == null ? 0 : d.hashCode())) * 31, 31, this.d);
        bg8 bg8Var = this.e;
        return iB2 + (bg8Var != null ? bg8Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f1390a, "ResidentStartGameRequest(whence=", ", lng=", this.b, ", bet=");
        sbR.append(this.c);
        sbR.append(", walletId=");
        sbR.append(this.d);
        sbR.append(", bonusRequest=");
        sbR.append(this.e);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }

    public asf0(long j, bg8 bg8Var, Double d, String str) {
        this.f1390a = 22;
        this.b = str;
        this.c = d;
        this.d = j;
        this.e = bg8Var;
    }
}
