package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class x5p0 {
    public static final w5p0 Companion = new w5p0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40329a;
    public final List b;
    public final String c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new fno0((byte) 15)), maz.a(wezVar, new fno0((byte) 16)), null, maz.a(wezVar, new fno0((byte) 17))};
    }

    public /* synthetic */ x5p0(int i, String str, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f40329a = null;
        } else {
            this.f40329a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5p0)) {
            return false;
        }
        x5p0 x5p0Var = (x5p0) obj;
        return Intrinsics.d(this.f40329a, x5p0Var.f40329a) && Intrinsics.d(this.b, x5p0Var.b) && Intrinsics.d(this.c, x5p0Var.c) && Intrinsics.d(this.d, x5p0Var.d);
    }

    public final int hashCode() {
        List list = this.f40329a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list3 = this.d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return rw2.m(this.c, ", weaknesses=", Separators.RPAREN, w6x.t("TeamCharacteristicsModelResponse(strengths=", ", style=", this.f40329a, ", teamId=", this.b), this.d);
    }
}
