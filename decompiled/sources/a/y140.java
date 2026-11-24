package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y140 implements z140 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41837a;
    public final r040 b;
    public final int c;
    public final iz30 d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final String j;
    public final String k;
    public final String l;

    public y140(boolean z, r040 r040Var, int i, iz30 iz30Var, int i2, String str, String str2, int i3, int i4, String str3, String str4, String str5) {
        r040Var.getClass();
        str3.getClass();
        this.f41837a = z;
        this.b = r040Var;
        this.c = i;
        this.d = iz30Var;
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.h = i3;
        this.i = i4;
        this.j = str3;
        this.k = str4;
        this.l = str5;
    }

    @Override // a.f240
    public final boolean K() {
        return this.f41837a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y140)) {
            return false;
        }
        y140 y140Var = (y140) obj;
        return this.f41837a == y140Var.f41837a && this.b == y140Var.b && this.c == y140Var.c && this.d == y140Var.d && this.e == y140Var.e && this.f.equals(y140Var.f) && this.g.equals(y140Var.g) && this.h == y140Var.h && this.i == y140Var.i && Intrinsics.d(this.j, y140Var.j) && this.k.equals(y140Var.k) && this.l.equals(y140Var.l);
    }

    @Override // a.z140
    public final int getEventId() {
        return this.c;
    }

    @Override // a.z140
    public final String getTitle() {
        return this.j;
    }

    public final int hashCode() {
        return this.l.hashCode() + ua80.b(ua80.b(twn.a(this.i, twn.a(this.h, ua80.b(ua80.b(twn.a(this.e, f140.g(this.d, twn.a(this.c, w6x.f(this.b, Boolean.hashCode(this.f41837a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g), 31), 31), 31, this.j), 31, this.k);
    }

    @Override // a.f240
    public final iz30 m() {
        return this.d;
    }

    @Override // a.f240
    public final r040 n() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialMenuIndividualUiItem(isBadgeVisible=");
        sb.append(this.f41837a);
        sb.append(", menuSectionType=");
        sb.append(this.b);
        sb.append(", eventId=");
        sb.append(this.c);
        sb.append(", menuItemModel=");
        sb.append(this.d);
        sb.append(", iconTint=");
        kng0.w(this.e, ", iconUrl=", this.f, ", iconBackgroundUrl=", sb);
        twn.w(this.h, this.g, ", iconPlaceholderTint=", ", iconPlaceholder=", sb);
        kng0.w(this.i, ", title=", this.j, ", subtitle=", sb);
        return ua80.m(sb, this.k, ", endIconUrl=", this.l, Separators.RPAREN);
    }
}
