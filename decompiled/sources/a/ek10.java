package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class ek10 {
    public static final dk10 Companion = new dk10();
    public static final a8z[] g = {maz.a(wez.f39042a, new gf10(4)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7934a;
    public final String b;
    public final Double c;
    public final Double d;
    public final Double e;
    public final Long f;

    public /* synthetic */ ek10(int i, List list, String str, Double d, Double d2, Double d3, Long l) {
        if ((i & 1) == 0) {
            this.f7934a = null;
        } else {
            this.f7934a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek10)) {
            return false;
        }
        ek10 ek10Var = (ek10) obj;
        return Intrinsics.d(this.f7934a, ek10Var.f7934a) && Intrinsics.d(this.b, ek10Var.b) && Intrinsics.d(this.c, ek10Var.c) && Intrinsics.d(this.d, ek10Var.d) && Intrinsics.d(this.e, ek10Var.e) && Intrinsics.d(this.f, ek10Var.f);
    }

    public final int hashCode() {
        List list = this.f7934a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.d;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.e;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l = this.f;
        return iHashCode5 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ua80.o("LuckyCardResponse(result=", ", status=", this.b, this.f7934a, ", winSum=");
        vqd.w(sbO, this.c, ", newBalance=", this.d, ", coeff=");
        sbO.append(this.e);
        sbO.append(", accountId=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
