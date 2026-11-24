package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wm10 implements ym10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd f39383a;
    public final vo10 b;
    public final String c;
    public final String d;
    public final List e;
    public final wul f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public wm10(sd sdVar, vo10 vo10Var, String str, String str2, List list, wul wulVar, boolean z, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f39383a = sdVar;
        this.b = vo10Var;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = wulVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    @Override // a.ym10
    public final boolean a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm10)) {
            return false;
        }
        wm10 wm10Var = (wm10) obj;
        return this.f39383a.equals(wm10Var.f39383a) && this.b.equals(wm10Var.b) && Intrinsics.d(this.c, wm10Var.c) && Intrinsics.d(this.d, wm10Var.d) && Intrinsics.d(this.e, wm10Var.e) && this.f.equals(wm10Var.f) && this.g == wm10Var.g && this.h == wm10Var.h && this.i == wm10Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + brm0.e(brm0.e(i8i.a(this.f, dw9.a(ua80.b(ua80.b((this.b.hashCode() + (this.f39383a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Prizes(balance=");
        sb.append(this.f39383a);
        sb.append(", wheel=");
        sb.append(this.b);
        sb.append(", titleCaption=");
        f140.v(sb, this.c, ", title=", this.d, ", prizes=");
        sb.append(this.e);
        sb.append(", continueButton=");
        sb.append(this.f);
        sb.append(", toolbarButtonsEnabled=");
        ua80.u(", backButtonEnabled=", ", networkAvailable=", sb, this.g, this.h);
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
