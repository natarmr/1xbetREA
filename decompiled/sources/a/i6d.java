package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class i6d {
    public static final h6d Companion = new h6d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f14234a;
    public final Integer b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final Boolean f;

    public /* synthetic */ i6d(int i, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2) {
        if ((i & 1) == 0) {
            this.f14234a = null;
        } else {
            this.f14234a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
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
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6d)) {
            return false;
        }
        i6d i6dVar = (i6d) obj;
        return Intrinsics.d(this.f14234a, i6dVar.f14234a) && Intrinsics.d(this.b, i6dVar.b) && Intrinsics.d(this.c, i6dVar.c) && Intrinsics.d(this.d, i6dVar.d) && Intrinsics.d(this.e, i6dVar.e) && Intrinsics.d(this.f, i6dVar.f);
    }

    public final int hashCode() {
        Integer num = this.f14234a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("ColumnTitleValueResponse(type=", this.f14234a, ", iconType=", this.b, ", title=");
        f140.v(sbQ, this.c, ", description=", this.d, ", isFixed=");
        sbQ.append(this.e);
        sbQ.append(", isOffset=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
