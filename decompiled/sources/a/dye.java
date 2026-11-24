package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class dye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6887a;
    public final aye b;
    public final oxe c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;
    public final j680 j;

    public dye(String str, aye ayeVar, oxe oxeVar, String str2, boolean z, String str3, String str4, boolean z2, String str5, j680 j680Var) {
        cs0.x(str, str3, str4, str5);
        this.f6887a = str;
        this.b = ayeVar;
        this.c = oxeVar;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = str4;
        this.h = z2;
        this.i = str5;
        this.j = j680Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dye)) {
            return false;
        }
        dye dyeVar = (dye) obj;
        return Intrinsics.d(this.f6887a, dyeVar.f6887a) && this.b.equals(dyeVar.b) && this.c.equals(dyeVar.c) && this.d.equals(dyeVar.d) && this.e == dyeVar.e && Intrinsics.d(this.f, dyeVar.f) && Intrinsics.d(this.g, dyeVar.g) && this.h == dyeVar.h && Intrinsics.d(this.i, dyeVar.i) && Intrinsics.d(this.j, dyeVar.j);
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(ua80.b(ua80.b(brm0.e(ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f6887a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        j680 j680Var = this.j;
        return iB + (j680Var == null ? 0 : j680Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CouponInfoUiModel(eventsCount=");
        sb.append(this.f6887a);
        sb.append(", systemTypeState=");
        sb.append(this.b);
        sb.append(", coefficientContainerState=");
        sb.append(this.c);
        sb.append(", coefChangeDesc=");
        sb.append(this.d);
        sb.append(", isAuthorized=");
        f140.s(", coefTitle=", this.f, ", whenCoefChangedTitle=", sb, this.e);
        brm0.C(this.g, ", isAutoSub=", ", autoSubLabel=", sb, this.h);
        sb.append(this.i);
        sb.append(", optiBetUiState=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
