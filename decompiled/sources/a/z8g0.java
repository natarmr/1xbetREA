package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class z8g0 {
    public static final x8g0 Companion = new x8g0();
    public static final a8z[] h = {null, null, null, null, null, null, maz.a(wez.f39042a, new j6g0(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f43965a;
    public final Long b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final String f;
    public final List g;

    public /* synthetic */ z8g0(int i, Long l, Long l2, Integer num, Integer num2, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f43965a = null;
        } else {
            this.f43965a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
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
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8g0)) {
            return false;
        }
        z8g0 z8g0Var = (z8g0) obj;
        return Intrinsics.d(this.f43965a, z8g0Var.f43965a) && Intrinsics.d(this.b, z8g0Var.b) && Intrinsics.d(this.c, z8g0Var.c) && Intrinsics.d(this.d, z8g0Var.d) && Intrinsics.d(this.e, z8g0Var.e) && Intrinsics.d(this.f, z8g0Var.f) && Intrinsics.d(this.g, z8g0Var.g);
    }

    public final int hashCode() {
        Long l = this.f43965a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f43965a, this.b, "ResultsResponse(dateFrom=", ", dateTo=", ", result=");
        rz4.y(sbO, this.c, ", status=", this.d, ", time=");
        f140.v(sbO, this.e, ", title=", this.f, ", veloJerseys=");
        return dw9.r(sbO, this.g, Separators.RPAREN);
    }
}
