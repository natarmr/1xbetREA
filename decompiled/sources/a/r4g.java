package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class r4g {
    public static final q4g Companion = new q4g();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new dpf((byte) 25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f29832a;
    public final Long b;
    public final List c;

    public /* synthetic */ r4g(int i, Long l, Long l2, List list) {
        if ((i & 1) == 0) {
            this.f29832a = null;
        } else {
            this.f29832a = l;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4g)) {
            return false;
        }
        r4g r4gVar = (r4g) obj;
        return Intrinsics.d(this.f29832a, r4gVar.f29832a) && Intrinsics.d(this.b, r4gVar.b) && Intrinsics.d(this.c, r4gVar.c);
    }

    public final int hashCode() {
        Long l = this.f29832a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(rz4.o(this.f29832a, this.b, "CyberCalendarAvailableParamsResponse(subSportId=", ", tourType=", ", dates="), this.c, Separators.RPAREN);
    }
}
