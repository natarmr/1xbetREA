package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class yyk0 {
    public static final xyk0 Companion = new xyk0();
    public static final a8z[] g = {maz.a(wez.f39042a, new pdk0(28)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43471a;
    public final Double b;
    public final bg8 c;
    public final long d;
    public final String e;
    public final int f;

    public /* synthetic */ yyk0(int i, int i2, long j, bg8 bg8Var, Double d, String str, List list) {
        if (57 != (i & 57)) {
            m2x.I(i, 57, wyk0.f39977a.getDescriptor());
            throw null;
        }
        this.f43471a = list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bg8Var;
        }
        this.d = j;
        this.e = str;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyk0)) {
            return false;
        }
        yyk0 yyk0Var = (yyk0) obj;
        return Intrinsics.d(this.f43471a, yyk0Var.f43471a) && Intrinsics.d(this.b, yyk0Var.b) && Intrinsics.d(this.c, yyk0Var.c) && this.d == yyk0Var.d && Intrinsics.d(this.e, yyk0Var.e) && this.f == yyk0Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.f43471a.hashCode() * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        bg8 bg8Var = this.c;
        return Integer.hashCode(this.f) + ua80.b(rw2.b((iHashCode2 + (bg8Var != null ? bg8Var.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpinAndWinPlayRequest(betUser=");
        sb.append(this.f43471a);
        sb.append(", betSum=");
        sb.append(this.b);
        sb.append(", bonusRequest=");
        sb.append(this.c);
        sb.append(", accountId=");
        sb.append(this.d);
        axq.s(this.f, ", lng=", this.e, ", whence=", sb);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public yyk0(long j, bg8 bg8Var, Double d, String str, List list) {
        list.getClass();
        this.f43471a = list;
        this.b = d;
        this.c = bg8Var;
        this.d = j;
        this.e = str;
        this.f = 22;
    }
}
