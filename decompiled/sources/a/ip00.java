package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ip00 implements kp00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15141a;
    public final eub0 b;
    public final a4x c;
    public final mx80 d;
    public final vcd e;
    public final ud5 f;
    public final List g;
    public final String h;

    public ip00(String str, eub0 eub0Var, a4x a4xVar, mx80 mx80Var, vcd vcdVar, ud5 ud5Var, List list, String str2) {
        str.getClass();
        eub0Var.getClass();
        a4xVar.getClass();
        ud5Var.getClass();
        list.getClass();
        this.f15141a = str;
        this.b = eub0Var;
        this.c = a4xVar;
        this.d = mx80Var;
        this.e = vcdVar;
        this.f = ud5Var;
        this.g = list;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip00)) {
            return false;
        }
        ip00 ip00Var = (ip00) obj;
        return Intrinsics.d(this.f15141a, ip00Var.f15141a) && this.b == ip00Var.b && Intrinsics.d(this.c, ip00Var.c) && Intrinsics.d(this.d, ip00Var.d) && Intrinsics.d(this.e, ip00Var.e) && Intrinsics.d(this.f, ip00Var.f) && Intrinsics.d(this.g, ip00Var.g) && Intrinsics.d(this.h, ip00Var.h);
    }

    public final int hashCode() {
        int iB = cs0.b(this.c, (this.b.hashCode() + (this.f15141a.hashCode() * 31)) * 31, 31);
        mx80 mx80Var = this.d;
        int iHashCode = (iB + (mx80Var == null ? 0 : mx80Var.hashCode())) * 31;
        vcd vcdVar = this.e;
        int iA = dw9.a((this.f.hashCode() + ((iHashCode + (vcdVar == null ? 0 : vcdVar.hashCode())) * 31)) * 31, 31, this.g);
        String str = this.h;
        return iA + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MediaType(appVersion=" + this.f15141a + ", presetUiModel=" + this.b + ", stepProgressBarUiModel=" + this.c + ", partnerLogoUiModel=" + this.d + ", companyLogoUiModel=" + this.e + ", backgroundUiModel=" + this.f + ", preloadImageUrls=" + this.g + ", appUpdateImageUrlToPreload=" + this.h + Separators.RPAREN;
    }
}
