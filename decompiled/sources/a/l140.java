package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class l140 implements f240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f19231a;
    public final boolean b;
    public final r040 c;
    public final int d;
    public final String e;
    public final String f;
    public final int g;
    public final long h;

    public l140(iz30 iz30Var, boolean z, r040 r040Var, int i, String str, String str2, int i2, long j) {
        w6x.y(r040Var, str, str2);
        this.f19231a = iz30Var;
        this.b = z;
        this.c = r040Var;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = i2;
        this.h = j;
    }

    @Override // a.f240
    public final boolean K() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l140)) {
            return false;
        }
        l140 l140Var = (l140) obj;
        if (this.f19231a != l140Var.f19231a || this.b != l140Var.b || this.c != l140Var.c || this.d != l140Var.d || !Intrinsics.d(this.e, l140Var.e) || !Intrinsics.d(this.f, l140Var.f) || this.g != l140Var.g) {
            return false;
        }
        long j = l140Var.h;
        int i = y3d.h;
        return h2t0.a(this.h, j);
    }

    public final int hashCode() {
        int iA = twn.a(R.attr.uikitPrimary, twn.a(this.g, ua80.b(ua80.b(twn.a(R.attr.uikitStaticWhite, twn.a(R.attr.uikitPrimary, twn.a(this.d, w6x.f(this.c, brm0.e(this.f19231a.hashCode() * 31, 31, this.b), 31), 31), 31), 31), 31, this.e), 31, this.f), 31), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.h) + iA;
    }

    @Override // a.f240
    public final iz30 m() {
        return this.f19231a;
    }

    @Override // a.f240
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        String strI = y3d.i(this.h);
        StringBuilder sbS = w6x.s("DecoratedTintMenuUiItem(menuItemModel=", this.f19231a, ", isBadgeVisible=", this.b, ", menuSectionType=");
        f140.t(sbS, this.c, ", icon=", this.d, ", iconTint=");
        axq.r(R.attr.uikitPrimary, R.attr.uikitStaticWhite, ", iconBackgroundTint=", ", title=", sbS);
        f140.v(sbS, this.e, ", subtitle=", this.f, ", endIcon=");
        axq.r(this.g, R.attr.uikitPrimary, ", backgroundTint=", ", backgroundTintColor=", sbS);
        return axq.n(sbS, strI, Separators.RPAREN);
    }
}
