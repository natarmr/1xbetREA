package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class hfl {
    public static final gfl Companion = new gfl();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new xal(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12979a;
    public final int b;
    public final String c;
    public final List d;

    public /* synthetic */ hfl(int i, int i2, long j, String str, List list) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, ffl.f9450a.getDescriptor());
            throw null;
        }
        this.f12979a = j;
        this.b = i2;
        this.c = str;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfl)) {
            return false;
        }
        hfl hflVar = (hfl) obj;
        return this.f12979a == hflVar.f12979a && this.b == hflVar.b && Intrinsics.d(this.c, hflVar.c) && Intrinsics.d(this.d, hflVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(twn.a(this.b, Long.hashCode(this.f12979a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f12979a, "DragonsGoldCurrentWinRequest(userId=", ", actionStep=");
        ua80.t(", lng=", this.c, ", gameType=", sbQ, this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public hfl(int i, long j, String str, List list) {
        list.getClass();
        this.f12979a = j;
        this.b = i;
        this.c = str;
        this.d = list;
    }
}
