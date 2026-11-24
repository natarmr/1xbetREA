package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class thn {
    public static final shn Companion = new shn();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new dcn(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f33969a;
    public final Integer b;
    public final String c;
    public final List d;

    public /* synthetic */ thn(int i, Integer num, Long l, String str, List list) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, rhn.f30498a.getDescriptor());
            throw null;
        }
        this.f33969a = l;
        this.b = num;
        this.c = str;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thn)) {
            return false;
        }
        thn thnVar = (thn) obj;
        return Intrinsics.d(this.f33969a, thnVar.f33969a) && Intrinsics.d(this.b, thnVar.b) && Intrinsics.d(this.c, thnVar.c) && Intrinsics.d(this.d, thnVar.d);
    }

    public final int hashCode() {
        Long l = this.f33969a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return rw2.m(this.c, ", gameType=", Separators.RPAREN, cs0.q(this.b, this.f33969a, "EasternNightsCurrentWinRequest(userId=", ", actionStep=", ", lng="), this.d);
    }

    public thn(Long l, Integer num, String str, List list) {
        this.f33969a = l;
        this.b = num;
        this.c = str;
        this.d = list;
    }
}
