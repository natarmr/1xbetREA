package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class tdo {
    public static final ido Companion = new ido();
    public static final a8z[] e = {null, null, maz.a(wez.f39042a, new urn(17)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f33779a;
    public final Long b;
    public final List c;
    public final Boolean d;

    public /* synthetic */ tdo(int i, Boolean bool, Long l, Long l2, List list) {
        if ((i & 1) == 0) {
            this.f33779a = null;
        } else {
            this.f33779a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdo)) {
            return false;
        }
        tdo tdoVar = (tdo) obj;
        return Intrinsics.d(this.f33779a, tdoVar.f33779a) && Intrinsics.d(this.b, tdoVar.b) && Intrinsics.d(this.c, tdoVar.c) && Intrinsics.d(this.d, tdoVar.d);
    }

    public final int hashCode() {
        Long l = this.f33779a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f33779a, this.b, "EventGroupResponse(groupId=", ", shortGroupId=", ", events=");
        sbO.append(this.c);
        sbO.append(", specialSign=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
