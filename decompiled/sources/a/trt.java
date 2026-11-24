package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class trt {
    public static final srt Companion = new srt();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f34433a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Boolean e;
    public final Long f;
    public final Double g;

    public /* synthetic */ trt(int i, Long l, Double d, Integer num, Integer num2, Boolean bool, Long l2, Double d2) {
        if ((i & 1) == 0) {
            this.f34433a = null;
        } else {
            this.f34433a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trt)) {
            return false;
        }
        trt trtVar = (trt) obj;
        return Intrinsics.d(this.f34433a, trtVar.f34433a) && Intrinsics.d(this.b, trtVar.b) && Intrinsics.d(this.c, trtVar.c) && Intrinsics.d(this.d, trtVar.d) && Intrinsics.d(this.e, trtVar.e) && Intrinsics.d(this.f, trtVar.f) && Intrinsics.d(this.g, trtVar.g);
    }

    public final int hashCode() {
        Long l = this.f34433a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d2 = this.g;
        return iHashCode6 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetBalanceResponse(userId=");
        sb.append(this.f34433a);
        sb.append(", priceRotation=");
        sb.append(this.b);
        sb.append(", bonusBalance=");
        rz4.y(sb, this.c, ", rotationCount=", this.d, ", ban=");
        sb.append(this.e);
        sb.append(", accountId=");
        sb.append(this.f);
        sb.append(", balanceNew=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
