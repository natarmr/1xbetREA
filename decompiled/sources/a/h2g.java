package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class h2g {
    public static final g2g Companion = new g2g();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new dpf((byte) 16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12331a;
    public final Integer b;
    public final List c;

    public /* synthetic */ h2g(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f12331a = null;
        } else {
            this.f12331a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2g)) {
            return false;
        }
        h2g h2gVar = (h2g) obj;
        return Intrinsics.d(this.f12331a, h2gVar.f12331a) && Intrinsics.d(this.b, h2gVar.b) && Intrinsics.d(this.c, h2gVar.c);
    }

    public final int hashCode() {
        String str = this.f12331a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(axq.p(this.b, "CyberBaseOpponentResponse(fullName=", this.f12331a, ", countryId=", ", opps="), this.c, Separators.RPAREN);
    }
}
