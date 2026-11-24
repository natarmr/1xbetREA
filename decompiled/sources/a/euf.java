package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class euf {
    public static final duf Companion = new duf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f8417a;
    public final Long b;
    public final Integer c;
    public final Integer d;
    public final Boolean e;
    public final Integer f;

    public /* synthetic */ euf(int i, Integer num, Long l, Integer num2, Integer num3, Boolean bool, Integer num4) {
        if ((i & 1) == 0) {
            this.f8417a = null;
        } else {
            this.f8417a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euf)) {
            return false;
        }
        euf eufVar = (euf) obj;
        return Intrinsics.d(this.f8417a, eufVar.f8417a) && Intrinsics.d(this.b, eufVar.b) && Intrinsics.d(this.c, eufVar.c) && Intrinsics.d(this.d, eufVar.d) && Intrinsics.d(this.e, eufVar.e) && Intrinsics.d(this.f, eufVar.f);
    }

    public final int hashCode() {
        Integer num = this.f8417a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num4 = this.f;
        return iHashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f8417a, this.b, "CupheadRoundResponse(round=", ", time=", ", hp=");
        rz4.y(sbM, this.c, ", stage=", this.d, ", playerWin=");
        sbM.append(this.e);
        sbM.append(", stageCount=");
        sbM.append(this.f);
        sbM.append(Separators.RPAREN);
        return sbM.toString();
    }
}
