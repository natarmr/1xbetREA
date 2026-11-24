package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class zxm0 {
    public static final yxm0 Companion = new yxm0();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new x9m0(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f45167a;
    public final String b;
    public final Integer c;
    public final List d;

    public /* synthetic */ zxm0(int i, Integer num, Long l, String str, List list) {
        if ((i & 1) == 0) {
            this.f45167a = null;
        } else {
            this.f45167a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxm0)) {
            return false;
        }
        zxm0 zxm0Var = (zxm0) obj;
        return Intrinsics.d(this.f45167a, zxm0Var.f45167a) && Intrinsics.d(this.b, zxm0Var.b) && Intrinsics.d(this.c, zxm0Var.c) && Intrinsics.d(this.d, zxm0Var.d);
    }

    public final int hashCode() {
        Long l = this.f45167a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f45167a, "SubGamesForMainGameResponse(id=", ", subGameName=", this.b, ", gameTypeId=");
        sbS.append(this.c);
        sbS.append(", eventGroups=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
