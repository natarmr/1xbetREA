package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class nqf0 {
    public static final mqf0 Companion = new mqf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f23957a;
    public final bg8 b;
    public final String c;
    public final String d;
    public final int e;

    public /* synthetic */ nqf0(int i, Double d, bg8 bg8Var, String str, String str2, int i2) {
        if (28 != (i & 28)) {
            m2x.I(i, 28, lqf0.f20485a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f23957a = null;
        } else {
            this.f23957a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bg8Var;
        }
        this.c = str;
        this.d = str2;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqf0)) {
            return false;
        }
        nqf0 nqf0Var = (nqf0) obj;
        return Intrinsics.d(this.f23957a, nqf0Var.f23957a) && Intrinsics.d(this.b, nqf0Var.b) && Intrinsics.d(this.c, nqf0Var.c) && Intrinsics.d(this.d, nqf0Var.d) && this.e == nqf0Var.e;
    }

    public final int hashCode() {
        Double d = this.f23957a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        bg8 bg8Var = this.b;
        return Integer.hashCode(this.e) + ua80.b(ua80.b((iHashCode + (bg8Var != null ? bg8Var.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResidentIncreaseBetRequest(bet=");
        sb.append(this.f23957a);
        sb.append(", bonusRequest=");
        sb.append(this.b);
        sb.append(", gameId=");
        f140.v(sb, this.c, ", lng=", this.d, ", whence=");
        return rz4.j(this.e, Separators.RPAREN, sb);
    }

    public nqf0(Double d, bg8 bg8Var, String str, String str2) {
        str.getClass();
        this.f23957a = d;
        this.b = bg8Var;
        this.c = str;
        this.d = str2;
        this.e = 22;
    }
}
