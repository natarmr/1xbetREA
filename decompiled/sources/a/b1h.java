package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class b1h {
    public static final a1h Companion = new a1h();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new xng(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f1805a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final List e;

    public /* synthetic */ b1h(int i, Integer num, Integer num2, Long l, String str, List list) {
        if ((i & 1) == 0) {
            this.f1805a = null;
        } else {
            this.f1805a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1h)) {
            return false;
        }
        b1h b1hVar = (b1h) obj;
        return Intrinsics.d(this.f1805a, b1hVar.f1805a) && Intrinsics.d(this.b, b1hVar.b) && Intrinsics.d(this.c, b1hVar.c) && Intrinsics.d(this.d, b1hVar.d) && Intrinsics.d(this.e, b1hVar.e);
    }

    public final int hashCode() {
        Long l = this.f1805a;
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
        StringBuilder sbQ = cs0.q(this.b, this.f1805a, "CyberHeroAbilityResponse(id=", ", level=", ", maxLevel=");
        b1j.u(this.c, ", name=", this.d, ", build=", sbQ);
        return dw9.r(sbQ, this.e, Separators.RPAREN);
    }
}
