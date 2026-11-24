package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class jfr {
    public static final ifr Companion = new ifr();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16442a;
    public final Long b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new s9r((byte) 7)), null, maz.a(wezVar, new s9r((byte) 8))};
    }

    public /* synthetic */ jfr(int i, Long l, List list, List list2) {
        if ((i & 1) == 0) {
            this.f16442a = null;
        } else {
            this.f16442a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfr)) {
            return false;
        }
        jfr jfrVar = (jfr) obj;
        return Intrinsics.d(this.f16442a, jfrVar.f16442a) && Intrinsics.d(this.b, jfrVar.b) && Intrinsics.d(this.c, jfrVar.c);
    }

    public final int hashCode() {
        List list = this.f16442a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FutureMatchResponse(response=");
        sb.append(this.f16442a);
        sb.append(", sportId=");
        sb.append(this.b);
        sb.append(", teams=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
