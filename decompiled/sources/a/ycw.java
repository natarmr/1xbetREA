package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ycw {
    public static final xcw Companion = new xcw();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new ldv(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f42403a;
    public final String b;
    public final List c;

    public /* synthetic */ ycw(int i, Long l, String str, List list) {
        if ((i & 1) == 0) {
            this.f42403a = null;
        } else {
            this.f42403a = l;
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
        if (!(obj instanceof ycw)) {
            return false;
        }
        ycw ycwVar = (ycw) obj;
        return Intrinsics.d(this.f42403a, ycwVar.f42403a) && Intrinsics.d(this.b, ycwVar.b) && Intrinsics.d(this.c, ycwVar.c);
    }

    public final int hashCode() {
        Long l = this.f42403a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(cs0.s(this.f42403a, "HltvAwardsCategoriesResponse(id=", ", title=", this.b, ", nominations="), this.c, Separators.RPAREN);
    }
}
