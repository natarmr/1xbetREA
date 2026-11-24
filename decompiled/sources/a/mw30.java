package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mw30 implements nw30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22484a;
    public final iz30 b;
    public final r040 c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final ArrayList h;

    public mw30(boolean z, iz30 iz30Var, r040 r040Var, int i, String str, String str2, String str3, ArrayList arrayList) {
        r040Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f22484a = z;
        this.b = iz30Var;
        this.c = r040Var;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw30)) {
            return false;
        }
        mw30 mw30Var = (mw30) obj;
        return this.f22484a == mw30Var.f22484a && this.b == mw30Var.b && this.c == mw30Var.c && this.d == mw30Var.d && Intrinsics.d(this.e, mw30Var.e) && Intrinsics.d(this.f, mw30Var.f) && Intrinsics.d(this.g, mw30Var.g) && this.h.equals(mw30Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(ua80.b(twn.a(this.d, w6x.f(this.c, f140.g(this.b, Boolean.hashCode(this.f22484a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // a.nw30
    public final iz30 m() {
        return this.b;
    }

    @Override // a.nw30
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XGamesMenuUiItem(isBadgeVisible=");
        sb.append(this.f22484a);
        sb.append(", menuItemModel=");
        sb.append(this.b);
        sb.append(", menuSectionType=");
        f140.t(sb, this.c, ", iconResId=", this.d, ", title=");
        f140.v(sb, this.e, ", subtitle=", this.f, ", labelButton=");
        sb.append(this.g);
        sb.append(", xGames=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
