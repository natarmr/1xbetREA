package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class gp3 {
    public static final fp3 Companion = new fp3();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new f33(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f11663a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final List e;

    public /* synthetic */ gp3(int i, Integer num, Integer num2, Long l, String str, List list) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, ep3.f8166a.getDescriptor());
            throw null;
        }
        this.f11663a = l;
        this.b = num;
        this.c = num2;
        this.d = str;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp3)) {
            return false;
        }
        gp3 gp3Var = (gp3) obj;
        return Intrinsics.d(this.f11663a, gp3Var.f11663a) && Intrinsics.d(this.b, gp3Var.b) && Intrinsics.d(this.c, gp3Var.c) && Intrinsics.d(this.d, gp3Var.d) && Intrinsics.d(this.e, gp3Var.e);
    }

    public final int hashCode() {
        Long l = this.f11663a;
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
        StringBuilder sbQ = cs0.q(this.b, this.f11663a, "AppleFortuneActionRequest(userId=", ", actionStep=", ", choiceColumnPosition=");
        b1j.u(this.c, ", lng=", this.d, ", gameType=", sbQ);
        return dw9.r(sbQ, this.e, Separators.RPAREN);
    }

    public gp3(Long l, Integer num, Integer num2, String str, List list) {
        this.f11663a = l;
        this.b = num;
        this.c = num2;
        this.d = str;
        this.e = list;
    }
}
