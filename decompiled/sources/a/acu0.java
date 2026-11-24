package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class acu0 {
    public static final zbu0 Companion = new zbu0();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f648a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, null, null, maz.a(wezVar, new o1u0((byte) 10)), maz.a(wezVar, new o1u0((byte) 11))};
    }

    public /* synthetic */ acu0(int i, String str, String str2, String str3, List list, List list2) {
        if ((i & 1) == 0) {
            this.f648a = null;
        } else {
            this.f648a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
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
        if (!(obj instanceof acu0)) {
            return false;
        }
        acu0 acu0Var = (acu0) obj;
        return Intrinsics.d(this.f648a, acu0Var.f648a) && Intrinsics.d(this.b, acu0Var.b) && Intrinsics.d(this.c, acu0Var.c) && Intrinsics.d(this.d, acu0Var.d) && Intrinsics.d(this.e, acu0Var.e);
    }

    public final int hashCode() {
        String str = this.f648a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("VersionResponse(minVersion=", this.f648a, ", version=", this.b, ", updateUrl=");
        cs0.y(this.c, ", forceUpdateBuilds=", ", alternatePath=", sbN, this.d);
        return dw9.r(sbN, this.e, Separators.RPAREN);
    }
}
