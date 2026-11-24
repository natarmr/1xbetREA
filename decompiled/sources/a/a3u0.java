package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class a3u0 {
    public static final y2u0 Companion = new y2u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f193a;
    public final String b;
    public final Integer c;
    public final String d;

    public /* synthetic */ a3u0(int i, Integer num, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f193a = null;
        } else {
            this.f193a = l;
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
            this.d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3u0)) {
            return false;
        }
        a3u0 a3u0Var = (a3u0) obj;
        return Intrinsics.d(this.f193a, a3u0Var.f193a) && Intrinsics.d(this.b, a3u0Var.b) && Intrinsics.d(this.c, a3u0Var.c) && Intrinsics.d(this.d, a3u0Var.d);
    }

    public final int hashCode() {
        Long l = this.f193a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f193a, "ValueColTitleResponse(id=", ", title=", this.b, ", titleIconType=");
        sbS.append(this.c);
        sbS.append(", prompt=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
