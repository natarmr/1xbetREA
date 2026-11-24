package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ho2 {
    public static final go2 Companion = new go2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f13372a;
    public final Long b;
    public final String c;
    public final Long d;

    public /* synthetic */ ho2(int i, Long l, Long l2, String str, Long l3) {
        if ((i & 1) == 0) {
            this.f13372a = null;
        } else {
            this.f13372a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho2)) {
            return false;
        }
        ho2 ho2Var = (ho2) obj;
        return Intrinsics.d(this.f13372a, ho2Var.f13372a) && Intrinsics.d(this.b, ho2Var.b) && Intrinsics.d(this.c, ho2Var.c) && Intrinsics.d(this.d, ho2Var.d);
    }

    public final int hashCode() {
        Long l = this.f13372a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.d;
        return iHashCode3 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f13372a, this.b, "AlterVideoZoneResponse(gameId=", ", constId=", ", videoId=");
        sbO.append(this.c);
        sbO.append(", zonePlay=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
