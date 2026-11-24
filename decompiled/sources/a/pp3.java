package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class pp3 {
    public static final op3 Companion = new op3();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new f33(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f27356a;
    public final Integer b;
    public final String c;
    public final List d;

    public /* synthetic */ pp3(int i, Integer num, Long l, String str, List list) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, np3.f23893a.getDescriptor());
            throw null;
        }
        this.f27356a = l;
        this.b = num;
        this.c = str;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp3)) {
            return false;
        }
        pp3 pp3Var = (pp3) obj;
        return Intrinsics.d(this.f27356a, pp3Var.f27356a) && Intrinsics.d(this.b, pp3Var.b) && Intrinsics.d(this.c, pp3Var.c) && Intrinsics.d(this.d, pp3Var.d);
    }

    public final int hashCode() {
        Long l = this.f27356a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return rw2.m(this.c, ", gameType=", Separators.RPAREN, cs0.q(this.b, this.f27356a, "AppleFortuneCurrentWinRequest(userId=", ", actionStep=", ", lng="), this.d);
    }

    public pp3(Long l, Integer num, String str, List list) {
        this.f27356a = l;
        this.b = num;
        this.c = str;
        this.d = list;
    }
}
