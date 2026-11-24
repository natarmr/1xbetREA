package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class aca0 {
    public static final zba0 Companion = new zba0();
    public static final a8z[] f = {null, null, null, maz.a(wez.f39042a, new raa0(2)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f618a;
    public final Long b;
    public final String c;
    public final List d;
    public final String e;

    public /* synthetic */ aca0(int i, Integer num, Long l, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f618a = null;
        } else {
            this.f618a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aca0)) {
            return false;
        }
        aca0 aca0Var = (aca0) obj;
        return Intrinsics.d(this.f618a, aca0Var.f618a) && Intrinsics.d(this.b, aca0Var.b) && Intrinsics.d(this.c, aca0Var.c) && Intrinsics.d(this.d, aca0Var.d) && Intrinsics.d(this.e, aca0Var.e);
    }

    public final int hashCode() {
        Integer num = this.f618a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f618a, this.b, "PlayerTennisMenuItemResponse(age=", ", birthDay=", ", id=");
        cs0.y(this.c, ", menu=", ", plays=", sbM, this.d);
        return axq.n(sbM, this.e, Separators.RPAREN);
    }
}
