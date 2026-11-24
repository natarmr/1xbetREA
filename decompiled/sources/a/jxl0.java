package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class jxl0 {
    public static final gxl0 Companion = new gxl0();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f17312a;
    public final List b;
    public final List c;
    public final Integer d;
    public final lwl0 e;

    static {
        fwl0 fwl0Var = lwl0.Companion;
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, maz.a(wezVar, new fzk0((byte) 19)), maz.a(wezVar, new fzk0((byte) 20)), null, null};
    }

    public /* synthetic */ jxl0(int i, Integer num, List list, List list2, Integer num2, lwl0 lwl0Var) {
        if ((i & 1) == 0) {
            this.f17312a = null;
        } else {
            this.f17312a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = lwl0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxl0)) {
            return false;
        }
        jxl0 jxl0Var = (jxl0) obj;
        return Intrinsics.d(this.f17312a, jxl0Var.f17312a) && Intrinsics.d(this.b, jxl0Var.b) && Intrinsics.d(this.c, jxl0Var.c) && Intrinsics.d(this.d, jxl0Var.d) && Intrinsics.d(this.e, jxl0Var.e);
    }

    public final int hashCode() {
        Integer num = this.f17312a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        lwl0 lwl0Var = this.e;
        return iHashCode4 + (lwl0Var != null ? lwl0Var.hashCode() : 0);
    }

    public final String toString() {
        return "StadiumResponse(sportId=" + this.f17312a + ", teams=" + this.b + ", players=" + this.c + ", subSportId=" + this.d + ", response=" + this.e + Separators.RPAREN;
    }
}
