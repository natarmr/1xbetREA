package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class pwk0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27715a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    public pwk0(int i, int i2, String str, String str2, String str3, String str4) {
        str.getClass();
        this.f27715a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwk0)) {
            return false;
        }
        pwk0 pwk0Var = (pwk0) obj;
        return this.f27715a == pwk0Var.f27715a && Intrinsics.d(this.b, pwk0Var.b) && this.c.equals(pwk0Var.c) && this.d.equals(pwk0Var.d) && this.e.equals(pwk0Var.e) && this.f == pwk0Var.f;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof pwk0) && (p6t0Var2 instanceof pwk0) && ((pwk0) p6t0Var).f27715a == ((pwk0) p6t0Var2).f27715a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(R.attr.uikitBackground) + twn.a(this.f, twn.a(R.attr.uikitSecondary, twn.a(R.drawable.sport_new, ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f27715a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f27715a, "SpecialEventUiModel(id=", ", title=", this.b, ", icon=");
        f140.v(sbR, this.c, ", backgroundIcon=", this.d, ", banner=");
        twn.w(R.drawable.sport_new, this.e, ", placeholderIcon=", ", tintPlaceholderIcon=", sbR);
        axq.r(R.attr.uikitSecondary, this.f, ", tintIcon=", ", defaultTintBackground=", sbR);
        return rz4.j(R.attr.uikitBackground, Separators.RPAREN, sbR);
    }
}
