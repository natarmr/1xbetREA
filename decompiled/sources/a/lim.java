package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lim implements qim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20114a;
    public final gmm b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;
    public final a4x h;
    public final String i;

    public lim(int i, gmm gmmVar, a4x a4xVar, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        str.getClass();
        gmmVar.getClass();
        str2.getClass();
        str3.getClass();
        a4xVar.getClass();
        this.f20114a = str;
        this.b = gmmVar;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = z2;
        this.g = i;
        this.h = a4xVar;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lim)) {
            return false;
        }
        lim limVar = (lim) obj;
        return Intrinsics.d(this.f20114a, limVar.f20114a) && Intrinsics.d(this.b, limVar.b) && this.c == limVar.c && Intrinsics.d(this.d, limVar.d) && Intrinsics.d(this.e, limVar.e) && this.f == limVar.f && this.g == limVar.g && Intrinsics.d(this.h, limVar.h) && Intrinsics.d(this.i, limVar.i);
    }

    public final int hashCode() {
        int iB = cs0.b(this.h, twn.a(this.g, brm0.e(ua80.b(ua80.b(brm0.e((this.b.hashCode() + (this.f20114a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31);
        String str = this.i;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LargeHeaderMediumTabs(navigationBarTitle=");
        sb.append(this.f20114a);
        sb.append(", navigationBarRightStyle=");
        sb.append(this.b);
        sb.append(", navigationBarSearchViewExpanded=");
        f140.s(", navigationBarSearchHint=", this.d, ", navigationBarSearchQuery=", sb, this.c);
        brm0.C(this.e, ", enableSearchAutoFocus=", ", currentTab=", sb, this.f);
        sb.append(this.g);
        sb.append(", availableTabs=");
        sb.append(this.h);
        sb.append(", navigationBarSubtitle=");
        return axq.n(sb, this.i, Separators.RPAREN);
    }
}
