package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class s2u0 {
    public static final q2u0 Companion = new q2u0();
    public static final a8z[] f = {null, null, maz.a(wez.f39042a, new o1u0(4)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f31522a;
    public final Integer b;
    public final List c;
    public final String d;
    public final Integer e;

    public /* synthetic */ s2u0(int i, Integer num, Integer num2, Long l, String str, List list) {
        if ((i & 1) == 0) {
            this.f31522a = null;
        } else {
            this.f31522a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2u0)) {
            return false;
        }
        s2u0 s2u0Var = (s2u0) obj;
        return Intrinsics.d(this.f31522a, s2u0Var.f31522a) && Intrinsics.d(this.b, s2u0Var.b) && Intrinsics.d(this.c, s2u0Var.c) && Intrinsics.d(this.d, s2u0Var.d) && Intrinsics.d(this.e, s2u0Var.e);
    }

    public final int hashCode() {
        Long l = this.f31522a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f31522a, "ValueColBodyResponse(id=", ", contentType=", ", value=");
        h97.y(", competitorId=", this.d, ", colSpan=", sbQ, this.c);
        return dw9.q(sbQ, this.e, Separators.RPAREN);
    }
}
