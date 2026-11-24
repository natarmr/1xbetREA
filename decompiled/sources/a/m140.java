package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m140 implements f240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f20987a;
    public final boolean b;
    public final r040 c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;

    public m140(iz30 iz30Var, boolean z, r040 r040Var, int i, int i2, int i3, String str, String str2, int i4, int i5) {
        w6x.y(r040Var, str, str2);
        this.f20987a = iz30Var;
        this.b = z;
        this.c = r040Var;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str;
        this.h = str2;
        this.i = i4;
        this.j = i5;
    }

    @Override // a.f240
    public final boolean K() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m140)) {
            return false;
        }
        m140 m140Var = (m140) obj;
        return this.f20987a == m140Var.f20987a && this.b == m140Var.b && this.c == m140Var.c && this.d == m140Var.d && this.e == m140Var.e && this.f == m140Var.f && Intrinsics.d(this.g, m140Var.g) && Intrinsics.d(this.h, m140Var.h) && this.i == m140Var.i && this.j == m140Var.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + twn.a(this.i, ua80.b(ua80.b(twn.a(this.f, twn.a(this.e, twn.a(this.d, w6x.f(this.c, brm0.e(this.f20987a.hashCode() * 31, 31, this.b), 31), 31), 31), 31), 31, this.g), 31, this.h), 31);
    }

    @Override // a.f240
    public final iz30 m() {
        return this.f20987a;
    }

    @Override // a.f240
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbS = w6x.s("DecoratedVirtualTintMenuUiItem(menuItemModel=", this.f20987a, ", isBadgeVisible=", this.b, ", menuSectionType=");
        f140.t(sbS, this.c, ", icon=", this.d, ", iconTint=");
        axq.r(this.e, this.f, ", iconBackgroundTint=", ", title=", sbS);
        f140.v(sbS, this.g, ", subtitle=", this.h, ", endIcon=");
        return w6x.o(this.i, this.j, ", backgroundTint=", Separators.RPAREN, sbS);
    }
}
