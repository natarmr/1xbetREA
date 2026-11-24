package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class jpx {
    public static final ipx Companion = new ipx();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f16922a;
    public final Integer b;
    public final String c;
    public final String d;
    public final Long e;

    public /* synthetic */ jpx(int i, Boolean bool, Integer num, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f16922a = null;
        } else {
            this.f16922a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpx)) {
            return false;
        }
        jpx jpxVar = (jpx) obj;
        return Intrinsics.d(this.f16922a, jpxVar.f16922a) && Intrinsics.d(this.b, jpxVar.b) && Intrinsics.d(this.c, jpxVar.c) && Intrinsics.d(this.d, jpxVar.d) && Intrinsics.d(this.e, jpxVar.e);
    }

    public final int hashCode() {
        Boolean bool = this.f16922a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IsCallExistResponse(isExist=");
        sb.append(this.f16922a);
        sb.append(", errorId=");
        sb.append(this.b);
        sb.append(", message=");
        f140.v(sb, this.c, ", detailedMessage=", this.d, ", date=");
        return ohs0.r(sb, this.e, Separators.RPAREN);
    }
}
