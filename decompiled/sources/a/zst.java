package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class zst {
    public static final yst Companion = new yst();
    public static final a8z[] l = {null, null, null, null, maz.a(wez.f39042a, new tet(20)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44921a;
    public final Integer b;
    public final Long c;
    public final Integer d;
    public final List e;
    public final Long f;
    public final Boolean g;
    public final Boolean h;
    public final Integer i;
    public final Boolean j;
    public final String k;

    public /* synthetic */ zst(int i, String str, Integer num, Long l2, Integer num2, List list, Long l3, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, String str2) {
        if ((i & 1) == 0) {
            this.f44921a = null;
        } else {
            this.f44921a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zst)) {
            return false;
        }
        zst zstVar = (zst) obj;
        return Intrinsics.d(this.f44921a, zstVar.f44921a) && Intrinsics.d(this.b, zstVar.b) && Intrinsics.d(this.c, zstVar.c) && Intrinsics.d(this.d, zstVar.d) && Intrinsics.d(this.e, zstVar.e) && Intrinsics.d(this.f, zstVar.f) && Intrinsics.d(this.g, zstVar.g) && Intrinsics.d(this.h, zstVar.h) && Intrinsics.d(this.i, zstVar.i) && Intrinsics.d(this.j, zstVar.j) && Intrinsics.d(this.k, zstVar.k);
    }

    public final int hashCode() {
        String str = this.f44921a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool3 = this.j;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.k;
        return iHashCode10 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "GetBetInfoHistoryWithSummaryByGlobalChamp(language=", this.f44921a, ", cfView=", ", userBonusId=");
        brm0.A(this.d, this.c, ", count=", ", statusList=", sbP);
        sbP.append(this.e);
        sbP.append(", lastId=");
        sbP.append(this.f);
        sbP.append(", needSaleInfo=");
        defpackage.c.j(sbP, this.g, ", betsForSale=", this.h, ", partnerId=");
        brm0.z(this.j, this.i, ", calculateSummaryInfo=", ", globalChampId=", sbP);
        return axq.n(sbP, this.k, Separators.RPAREN);
    }

    public zst(String str, Integer num, Long l2, Integer num2, List list, Long l3, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, String str2) {
        this.f44921a = str;
        this.b = num;
        this.c = l2;
        this.d = num2;
        this.e = list;
        this.f = l3;
        this.g = bool;
        this.h = bool2;
        this.i = num3;
        this.j = bool3;
        this.k = str2;
    }
}
