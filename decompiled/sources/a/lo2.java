package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class lo2 {
    public static final ko2 Companion = new ko2();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20370a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{maz.a(wezVar, new t32((byte) 13)), null, null, maz.a(wezVar, new t32((byte) 14)), null};
    }

    public /* synthetic */ lo2(int i, String str, String str2, String str3, List list, List list2) {
        if ((i & 1) == 0) {
            this.f20370a = null;
        } else {
            this.f20370a = list;
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
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo2)) {
            return false;
        }
        lo2 lo2Var = (lo2) obj;
        return Intrinsics.d(this.f20370a, lo2Var.f20370a) && Intrinsics.d(this.b, lo2Var.b) && Intrinsics.d(this.c, lo2Var.c) && Intrinsics.d(this.d, lo2Var.d) && Intrinsics.d(this.e, lo2Var.e);
    }

    public final int hashCode() {
        List list = this.f20370a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ua80.o("AlternatePathResponse(countryIds=", ", version=", this.b, this.f20370a, ", updateURL=");
        cs0.y(this.c, ", forceUpdateBuilds=", ", minAppVersion=", sbO, this.d);
        return axq.n(sbO, this.e, Separators.RPAREN);
    }
}
