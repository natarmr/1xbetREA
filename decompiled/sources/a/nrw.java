package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class nrw {
    public static final mrw Companion = new mrw();
    public static final a8z[] f = {null, null, maz.a(wez.f39042a, new kdw(12)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f24025a;
    public final String b;
    public final List c;
    public final Integer d;
    public final String e;

    public /* synthetic */ nrw(int i, Integer num, Long l, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f24025a = null;
        } else {
            this.f24025a = l;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrw)) {
            return false;
        }
        nrw nrwVar = (nrw) obj;
        return Intrinsics.d(this.f24025a, nrwVar.f24025a) && Intrinsics.d(this.b, nrwVar.b) && Intrinsics.d(this.c, nrwVar.c) && Intrinsics.d(this.d, nrwVar.d) && Intrinsics.d(this.e, nrwVar.e);
    }

    public final int hashCode() {
        Long l = this.f24025a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f24025a, "HorsesResponse(dateStart=", ", id=", this.b, ", menu=");
        sbS.append(this.c);
        sbS.append(", status=");
        sbS.append(this.d);
        sbS.append(", title=");
        return axq.n(sbS, this.e, Separators.RPAREN);
    }
}
