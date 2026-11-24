package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dus0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6712a;
    public final String b;
    public final String c;
    public final a4x d;
    public final boolean e;
    public final String f;
    public final float g;
    public final float h;

    public dus0(String str, String str2, String str3, i4 i4Var, boolean z, String str4, float f, float f2) {
        str3.getClass();
        i4Var.getClass();
        str4.getClass();
        this.f6712a = str;
        this.b = str2;
        this.c = str3;
        this.d = i4Var;
        this.e = z;
        this.f = str4;
        this.g = f;
        this.h = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dus0)) {
            return false;
        }
        dus0 dus0Var = (dus0) obj;
        return this.f6712a.equals(dus0Var.f6712a) && this.b.equals(dus0Var.b) && Intrinsics.d(this.c, dus0Var.c) && Intrinsics.d(this.d, dus0Var.d) && this.e == dus0Var.e && Intrinsics.d(this.f, dus0Var.f) && ycl.b(this.g, dus0Var.g) && ycl.b(this.h, dus0Var.h);
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + defpackage.c.a(ua80.b(brm0.e(cs0.b(this.d, ua80.b(ua80.b(this.f6712a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), this.g, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.g);
        String strC2 = ycl.c(this.h);
        StringBuilder sbN = b1j.n("TwentyOneDotaHeroUiModel(image=", this.f6712a, ", score=", this.b, ", speech=");
        cs0.B(sbN, this.c, ", cardList=", this.d, ", winner=");
        f140.s(", typefacePath=", this.f, ", gameRowHeight=", sbN, this.e);
        return ua80.m(sbN, strC, ", heroCardPadding=", strC2, Separators.RPAREN);
    }
}
