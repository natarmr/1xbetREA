package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class fw30 implements hw30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10240a;
    public final r040 b;
    public final int c;
    public final long d;
    public final String e;
    public final String f;
    public final long g;
    public final String h;
    public final String i;

    public fw30(boolean z, r040 r040Var, int i, long j, String str, String str2, long j2, String str3, String str4) {
        htz htzVar = iz30.f15618a;
        r040Var.getClass();
        str3.getClass();
        this.f10240a = z;
        this.b = r040Var;
        this.c = i;
        this.d = j;
        this.e = str;
        this.f = str2;
        this.g = j2;
        this.h = str3;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw30)) {
            return false;
        }
        fw30 fw30Var = (fw30) obj;
        if (this.f10240a != fw30Var.f10240a || this.b != fw30Var.b || this.c != fw30Var.c) {
            return false;
        }
        htz htzVar = iz30.f15618a;
        long j = fw30Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && this.e.equals(fw30Var.e) && this.f.equals(fw30Var.f) && h2t0.a(this.g, fw30Var.g) && Intrinsics.d(this.h, fw30Var.h) && this.i.equals(fw30Var.i);
    }

    public final int hashCode() {
        int iG = f140.g(iz30.c, twn.a(this.c, w6x.f(this.b, Boolean.hashCode(this.f10240a) * 31, 31), 31), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.i.hashCode() + ua80.b(twn.a(R.drawable.sport_new, rw2.b(ua80.b(ua80.b(rw2.b(iG, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 961, this.h);
    }

    @Override // a.nw30
    public final iz30 m() {
        return iz30.c;
    }

    @Override // a.nw30
    public final r040 n() {
        return this.b;
    }

    public final String toString() {
        iz30 iz30Var = iz30.c;
        String strI = y3d.i(this.d);
        String strI2 = y3d.i(this.g);
        StringBuilder sb = new StringBuilder("SpecialMenuDefaultUiItem(isBadgeVisible=");
        sb.append(this.f10240a);
        sb.append(", menuSectionType=");
        sb.append(this.b);
        sb.append(", eventId=");
        sb.append(this.c);
        sb.append(", menuItemModel=");
        sb.append(iz30Var);
        sb.append(", iconTint=");
        f140.v(sb, strI, ", iconUrl=", this.e, ", iconBackgroundUrl=");
        f140.v(sb, this.f, ", iconPlaceholderTint=", strI2, ", iconPlaceholder=");
        kng0.w(R.drawable.sport_new, ", title=", this.h, ", subtitle=, endIconUrl=", sb);
        return axq.n(sb, this.i, Separators.RPAREN);
    }
}
