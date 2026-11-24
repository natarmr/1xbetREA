package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class wgs {
    public static final vgs Companion = new vgs();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new o9s(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f39132a;
    public final String b;
    public final List c;

    public /* synthetic */ wgs(int i, Long l, String str, List list) {
        if ((i & 1) == 0) {
            this.f39132a = null;
        } else {
            this.f39132a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
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
        if (!(obj instanceof wgs)) {
            return false;
        }
        wgs wgsVar = (wgs) obj;
        return Intrinsics.d(this.f39132a, wgsVar.f39132a) && Intrinsics.d(this.b, wgsVar.b) && Intrinsics.d(this.c, wgsVar.c);
    }

    public final int hashCode() {
        Long l = this.f39132a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(cs0.s(this.f39132a, "GameInsightsResponse(gameId=", ", fullName=", this.b, ", insights="), this.c, Separators.RPAREN);
    }
}
