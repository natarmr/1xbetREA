package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class l8h {
    public static final k8h Companion = new k8h();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new x3h(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f19603a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final List e;

    public /* synthetic */ l8h(int i, Boolean bool, Integer num, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f19603a = null;
        } else {
            this.f19603a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
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
        if (!(obj instanceof l8h)) {
            return false;
        }
        l8h l8hVar = (l8h) obj;
        return Intrinsics.d(this.f19603a, l8hVar.f19603a) && Intrinsics.d(this.b, l8hVar.b) && Intrinsics.d(this.c, l8hVar.c) && Intrinsics.d(this.d, l8hVar.d) && Intrinsics.d(this.e, l8hVar.e);
    }

    public final int hashCode() {
        Integer num = this.f19603a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f19603a, "CyberMatchTeamResponse(id=", ", name=", this.b, ", image=");
        h97.v(this.d, this.c, ", isWinner=", ", players=", sbN);
        return dw9.r(sbN, this.e, Separators.RPAREN);
    }
}
