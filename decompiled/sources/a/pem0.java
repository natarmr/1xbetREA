package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class pem0 {
    public static final mem0 Companion = new mem0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f26862a;
    public final String b;
    public final String c;
    public final Long d;
    public final Long e;
    public final Boolean f;
    public final Boolean g;

    public /* synthetic */ pem0(int i, Boolean bool, String str, String str2, Long l, Long l2, Boolean bool2, Boolean bool3) {
        if ((i & 1) == 0) {
            this.f26862a = null;
        } else {
            this.f26862a = bool;
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
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pem0)) {
            return false;
        }
        pem0 pem0Var = (pem0) obj;
        return Intrinsics.d(this.f26862a, pem0Var.f26862a) && Intrinsics.d(this.b, pem0Var.b) && Intrinsics.d(this.c, pem0Var.c) && Intrinsics.d(this.d, pem0Var.d) && Intrinsics.d(this.e, pem0Var.e) && Intrinsics.d(this.f, pem0Var.f) && Intrinsics.d(this.g, pem0Var.g);
    }

    public final int hashCode() {
        Boolean bool = this.f26862a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.g;
        return iHashCode6 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatisticInfoResponse(hasStatRatingTables=");
        sb.append(this.f26862a);
        sb.append(", gameId=");
        sb.append(this.b);
        sb.append(", stageId=");
        h97.w(this.d, this.c, ", stageType=", ", status=", sb);
        sb.append(this.e);
        sb.append(", hasLineUps=");
        sb.append(this.f);
        sb.append(", hasStadiumInfo=");
        return defpackage.c.e(sb, this.g, Separators.RPAREN);
    }
}
