package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w140 implements f240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f38381a;
    public final boolean b;
    public final r040 c;
    public final int d;
    public final String e;
    public final String f;

    public w140(iz30 iz30Var, boolean z, r040 r040Var, int i, String str, String str2) {
        iz30Var.getClass();
        r040Var.getClass();
        str.getClass();
        str2.getClass();
        this.f38381a = iz30Var;
        this.b = z;
        this.c = r040Var;
        this.d = i;
        this.e = str;
        this.f = str2;
    }

    @Override // a.f240
    public final boolean K() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w140)) {
            return false;
        }
        w140 w140Var = (w140) obj;
        return this.f38381a == w140Var.f38381a && this.b == w140Var.b && this.c == w140Var.c && this.d == w140Var.d && Intrinsics.d(this.e, w140Var.e) && Intrinsics.d(this.f, w140Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(twn.a(this.d, w6x.f(this.c, brm0.e(this.f38381a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e);
    }

    @Override // a.f240
    public final iz30 m() {
        return this.f38381a;
    }

    @Override // a.f240
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbS = w6x.s("SimpleMenuUiItem(menuItemModel=", this.f38381a, ", isBadgeVisible=", this.b, ", menuSectionType=");
        f140.t(sbS, this.c, ", icon=", this.d, ", title=");
        return ua80.m(sbS, this.e, ", subtitle=", this.f, Separators.RPAREN);
    }
}
