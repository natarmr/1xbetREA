package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class lgl {
    public static final kgl Companion = new kgl();
    public static final a8z[] h = {null, null, null, null, null, null, maz.a(wez.f39042a, new xal(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20014a;
    public final bg8 b;
    public final long c;
    public final Double d;
    public final int e;
    public final String f;
    public final List g;

    public /* synthetic */ lgl(int i, long j, bg8 bg8Var, long j2, Double d, int i2, String str, List list) {
        if (117 != (i & 117)) {
            m2x.I(i, 117, jgl.f16486a.getDescriptor());
            throw null;
        }
        this.f20014a = j;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bg8Var;
        }
        this.c = j2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d;
        }
        this.e = i2;
        this.f = str;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgl)) {
            return false;
        }
        lgl lglVar = (lgl) obj;
        return this.f20014a == lglVar.f20014a && Intrinsics.d(this.b, lglVar.b) && this.c == lglVar.c && Intrinsics.d(this.d, lglVar.d) && this.e == lglVar.e && Intrinsics.d(this.f, lglVar.f) && Intrinsics.d(this.g, lglVar.g);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f20014a) * 31;
        bg8 bg8Var = this.b;
        int iB = rw2.b((iHashCode + (bg8Var == null ? 0 : bg8Var.hashCode())) * 31, 31, this.c);
        Double d = this.d;
        return this.g.hashCode() + ua80.b(twn.a(this.e, (iB + (d != null ? d.hashCode() : 0)) * 31, 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DragonsGoldRequest(userId=");
        sb.append(this.f20014a);
        sb.append(", bonusRequest=");
        sb.append(this.b);
        kng0.A(sb, ", walletId=", this.c, ", betSum=");
        sb.append(this.d);
        sb.append(", whence=");
        sb.append(this.e);
        sb.append(", lng=");
        return rw2.m(this.f, ", gameType=", Separators.RPAREN, sb, this.g);
    }

    public lgl(long j, bg8 bg8Var, long j2, Double d, String str, List list) {
        list.getClass();
        this.f20014a = j;
        this.b = bg8Var;
        this.c = j2;
        this.d = d;
        this.e = 22;
        this.f = str;
        this.g = list;
    }
}
