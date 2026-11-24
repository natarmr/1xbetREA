package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class lhn {
    public static final khn Companion = new khn();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new dcn(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f20065a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final List e;

    public /* synthetic */ lhn(int i, Integer num, Integer num2, Long l, String str, List list) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, jhn.f16536a.getDescriptor());
            throw null;
        }
        this.f20065a = l;
        this.b = num;
        this.c = num2;
        this.d = str;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhn)) {
            return false;
        }
        lhn lhnVar = (lhn) obj;
        return Intrinsics.d(this.f20065a, lhnVar.f20065a) && Intrinsics.d(this.b, lhnVar.b) && Intrinsics.d(this.c, lhnVar.c) && Intrinsics.d(this.d, lhnVar.d) && Intrinsics.d(this.e, lhnVar.e);
    }

    public final int hashCode() {
        Long l = this.f20065a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f20065a, "EasternNightsActionRequest(userId=", ", actionStep=", ", choiceColumnPosition=");
        b1j.u(this.c, ", lng=", this.d, ", gameType=", sbQ);
        return dw9.r(sbQ, this.e, Separators.RPAREN);
    }

    public lhn(Long l, Integer num, Integer num2, String str, List list) {
        this.f20065a = l;
        this.b = num;
        this.c = num2;
        this.d = str;
        this.e = list;
    }
}
