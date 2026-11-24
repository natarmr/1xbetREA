package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kfl0 implements pfl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8l0 f18201a;
    public final a4x b;
    public final String c;
    public final boolean d;
    public final float e;
    public final boolean f;

    public kfl0(j8l0 j8l0Var, a4x a4xVar, String str, boolean z, float f, boolean z2) {
        a4xVar.getClass();
        str.getClass();
        this.f18201a = j8l0Var;
        this.b = a4xVar;
        this.c = str;
        this.d = z;
        this.e = f;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfl0)) {
            return false;
        }
        kfl0 kfl0Var = (kfl0) obj;
        return this.f18201a == kfl0Var.f18201a && Intrinsics.d(this.b, kfl0Var.b) && Intrinsics.d(this.c, kfl0Var.c) && this.d == kfl0Var.d && ycl.b(this.e, kfl0Var.e) && this.f == kfl0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + defpackage.c.a(brm0.e(ua80.b(cs0.b(this.b, this.f18201a.hashCode() * 31, 31), 31, this.c), 31, this.d), this.e, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.e);
        StringBuilder sb = new StringBuilder("Data(listStyle=");
        sb.append(this.f18201a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", subtitleText=");
        brm0.C(this.c, ", refreshing=", ", paddingTop=", sb, this.d);
        return defpackage.c.c(strC, ", scrollToTop=", Separators.RPAREN, sb, this.f);
    }
}
