package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class f6i0 {
    public static final d6i0 Companion = new d6i0();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9012a;
    public final Integer b;
    public final String c;
    public final List d;
    public final List e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, null, null, maz.a(wezVar, new igh0((byte) 23)), maz.a(wezVar, new igh0((byte) 25))};
    }

    public /* synthetic */ f6i0(int i, String str, Integer num, String str2, List list, List list2) {
        if ((i & 1) == 0) {
            this.f9012a = null;
        } else {
            this.f9012a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6i0)) {
            return false;
        }
        f6i0 f6i0Var = (f6i0) obj;
        return Intrinsics.d(this.f9012a, f6i0Var.f9012a) && Intrinsics.d(this.b, f6i0Var.b) && Intrinsics.d(this.c, f6i0Var.c) && Intrinsics.d(this.d, f6i0Var.d) && Intrinsics.d(this.e, f6i0Var.e);
    }

    public final int hashCode() {
        String str = this.f9012a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "SelectorTabResponse(title=", this.f9012a, ", titleRefType=", ", titleRefId=");
        cs0.y(this.c, ", tables=", ", selectors=", sbP, this.d);
        return dw9.r(sbP, this.e, Separators.RPAREN);
    }
}
