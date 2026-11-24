package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class jft {
    public static final ift Companion = new ift();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16445a;
    public final bg8 b;
    public final Double c;
    public final long d;
    public final String e;
    public final int f;

    public /* synthetic */ jft(int i, long j, bg8 bg8Var, Double d, long j2, String str, int i2) {
        if (57 != (i & 57)) {
            m2x.I(i, 57, hft.f12985a.getDescriptor());
            throw null;
        }
        this.f16445a = j;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bg8Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        this.d = j2;
        this.e = str;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jft)) {
            return false;
        }
        jft jftVar = (jft) obj;
        return this.f16445a == jftVar.f16445a && Intrinsics.d(this.b, jftVar.b) && Intrinsics.d(this.c, jftVar.c) && this.d == jftVar.d && Intrinsics.d(this.e, jftVar.e) && this.f == jftVar.f;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f16445a) * 31;
        bg8 bg8Var = this.b;
        int iHashCode2 = (iHashCode + (bg8Var == null ? 0 : bg8Var.hashCode())) * 31;
        Double d = this.c;
        return Integer.hashCode(this.f) + ua80.b(rw2.b((iHashCode2 + (d != null ? d.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GemsOdysseyGameRequest(userId=");
        sb.append(this.f16445a);
        sb.append(", bonusRequest=");
        sb.append(this.b);
        sb.append(", betSum=");
        sb.append(this.c);
        sb.append(", accountId=");
        kng0.z(sb, this.d, ", lng=", this.e);
        return vqd.p(sb, ", whence=", this.f, Separators.RPAREN);
    }

    public jft(long j, bg8 bg8Var, Double d, long j2, String str) {
        this.f16445a = j;
        this.b = bg8Var;
        this.c = d;
        this.d = j2;
        this.e = str;
        this.f = 22;
    }
}
