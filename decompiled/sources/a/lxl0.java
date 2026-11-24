package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class lxl0 {
    public static final ixl0 Companion = new ixl0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f20820a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ lxl0(int i, Long l, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f20820a = null;
        } else {
            this.f20820a = l;
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
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxl0)) {
            return false;
        }
        lxl0 lxl0Var = (lxl0) obj;
        return Intrinsics.d(this.f20820a, lxl0Var.f20820a) && Intrinsics.d(this.b, lxl0Var.b) && Intrinsics.d(this.c, lxl0Var.c) && Intrinsics.d(this.d, lxl0Var.d) && Intrinsics.d(this.e, lxl0Var.e);
    }

    public final int hashCode() {
        Long l = this.f20820a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f20820a, "StadiumResponse(id=", ", title=", this.b, ", capacity=");
        f140.v(sbS, this.c, ", opened=", this.d, ", architect=");
        return axq.n(sbS, this.e, Separators.RPAREN);
    }
}
