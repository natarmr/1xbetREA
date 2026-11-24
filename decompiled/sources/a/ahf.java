package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ahf implements iqg {
    public static final ygf Companion = new ygf();
    public static final a8z[] f = {null, null, null, maz.a(wez.f39042a, new x5f(14)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f872a;
    public final Integer b;
    public final agf c;
    public final List d;
    public final Integer e;

    public /* synthetic */ ahf(int i, Integer num, Integer num2, agf agfVar, List list, Integer num3) {
        if ((i & 1) == 0) {
            this.f872a = null;
        } else {
            this.f872a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = agfVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahf)) {
            return false;
        }
        ahf ahfVar = (ahf) obj;
        return Intrinsics.d(this.f872a, ahfVar.f872a) && Intrinsics.d(this.b, ahfVar.b) && Intrinsics.d(this.c, ahfVar.c) && Intrinsics.d(this.d, ahfVar.d) && Intrinsics.d(this.e, ahfVar.e);
    }

    public final int hashCode() {
        Integer num = this.f872a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        agf agfVar = this.c;
        int iHashCode3 = (iHashCode2 + (agfVar == null ? 0 : agfVar.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.e;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("CrystalResponse(status=", this.f872a, ", curStep=", this.b, ", info=");
        sbQ.append(this.c);
        sbQ.append(", matrix=");
        sbQ.append(this.d);
        sbQ.append(", period=");
        return dw9.q(sbQ, this.e, Separators.RPAREN);
    }

    public ahf() {
        this.f872a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
