package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class x140 implements z140 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40102a;
    public final r040 b;
    public final int c;
    public final iz30 d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public x140(boolean z, r040 r040Var, int i, iz30 iz30Var, String str, String str2, String str3, String str4, String str5) {
        r040Var.getClass();
        str3.getClass();
        this.f40102a = z;
        this.b = r040Var;
        this.c = i;
        this.d = iz30Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    @Override // a.f240
    public final boolean K() {
        return this.f40102a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x140)) {
            return false;
        }
        x140 x140Var = (x140) obj;
        return this.f40102a == x140Var.f40102a && this.b == x140Var.b && this.c == x140Var.c && this.d == x140Var.d && this.e.equals(x140Var.e) && this.f.equals(x140Var.f) && Intrinsics.d(this.g, x140Var.g) && this.h.equals(x140Var.h) && this.i.equals(x140Var.i);
    }

    @Override // a.z140
    public final int getEventId() {
        return this.c;
    }

    @Override // a.z140
    public final String getTitle() {
        return this.g;
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(ua80.b(twn.a(R.drawable.sport_new, twn.a(R.attr.uikitSecondary, ua80.b(ua80.b(twn.a(R.attr.uikitStaticWhite, f140.g(this.d, twn.a(this.c, w6x.f(this.b, Boolean.hashCode(this.f40102a) * 31, 31), 31), 31), 31), 31, this.e), 31, this.f), 31), 31), 31, this.g), 31, this.h);
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
        StringBuilder sb = new StringBuilder("SpecialMenuDefaultUiItem(isBadgeVisible=");
        sb.append(this.f40102a);
        sb.append(", menuSectionType=");
        sb.append(this.b);
        sb.append(", eventId=");
        sb.append(this.c);
        sb.append(", menuItemModel=");
        sb.append(this.d);
        sb.append(", iconTint=");
        kng0.w(R.attr.uikitStaticWhite, ", iconUrl=", this.e, ", iconBackgroundUrl=", sb);
        twn.w(R.attr.uikitSecondary, this.f, ", iconPlaceholderTint=", ", iconPlaceholder=", sb);
        kng0.w(R.drawable.sport_new, ", title=", this.g, ", subtitle=", sb);
        return ua80.m(sb, this.h, ", endIconUrl=", this.i, Separators.RPAREN);
    }
}
