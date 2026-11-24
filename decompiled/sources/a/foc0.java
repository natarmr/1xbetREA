package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class foc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9875a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final boolean g;
    public final String h;
    public final gz8 i;
    public final List j;

    public foc0(String str, String str2, String str3, String str4, int i, String str5, boolean z, String str6, gz8 gz8Var, List list) {
        list.getClass();
        this.f9875a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = z;
        this.h = str6;
        this.i = gz8Var;
        this.j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof foc0)) {
            return false;
        }
        foc0 foc0Var = (foc0) obj;
        return this.f9875a.equals(foc0Var.f9875a) && this.b.equals(foc0Var.b) && this.c.equals(foc0Var.c) && this.d.equals(foc0Var.d) && this.e == foc0Var.e && this.f.equals(foc0Var.f) && this.g == foc0Var.g && this.h.equals(foc0Var.h) && this.i == foc0Var.i && Intrinsics.d(this.j, foc0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ua80.b(brm0.e(ua80.b(twn.a(this.e, ua80.b(ua80.b(ua80.b(this.f9875a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PromoProductModel(imgPathDefault=", this.f9875a, ", imgPathDarkTheme=", this.b, ", imgPathLightTheme=");
        f140.v(sbN, this.c, ", imgBanner=", this.d, ", brandId=");
        kng0.w(this.e, ", brandName=", this.f, ", configured=", sbN);
        f140.s(", description=", this.h, ", viewType=", sbN, this.g);
        sbN.append(this.i);
        sbN.append(", partitions=");
        sbN.append(this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
