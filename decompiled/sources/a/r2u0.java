package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class r2u0 {
    public static final p2u0 Companion = new p2u0();
    public static final a8z[] e = {null, null, maz.a(wez.f39042a, new o1u0(3)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f29756a;
    public final String b;
    public final List c;
    public final String d;

    public /* synthetic */ r2u0(int i, Long l, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f29756a = null;
        } else {
            this.f29756a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
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
        if (!(obj instanceof r2u0)) {
            return false;
        }
        r2u0 r2u0Var = (r2u0) obj;
        return Intrinsics.d(this.f29756a, r2u0Var.f29756a) && Intrinsics.d(this.b, r2u0Var.b) && Intrinsics.d(this.c, r2u0Var.c) && Intrinsics.d(this.d, r2u0Var.d);
    }

    public final int hashCode() {
        Long l = this.f29756a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f29756a, "ValueColBodyResponse(id=", ", contentType=", this.b, ", value=");
        sbS.append(this.c);
        sbS.append(", competitorId=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
