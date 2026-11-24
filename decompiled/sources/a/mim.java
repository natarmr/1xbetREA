package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mim implements qim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gmm f21852a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final a4x g;
    public final String h;
    public final String i;

    public mim(int i, gmm gmmVar, a4x a4xVar, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        gmmVar.getClass();
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        this.f21852a = gmmVar;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = z2;
        this.f = i;
        this.g = a4xVar;
        this.h = str3;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mim)) {
            return false;
        }
        mim mimVar = (mim) obj;
        return Intrinsics.d(this.f21852a, mimVar.f21852a) && this.b == mimVar.b && Intrinsics.d(this.c, mimVar.c) && Intrinsics.d(this.d, mimVar.d) && this.e == mimVar.e && this.f == mimVar.f && Intrinsics.d(this.g, mimVar.g) && Intrinsics.d(this.h, mimVar.h) && Intrinsics.d(this.i, mimVar.i);
    }

    public final int hashCode() {
        int iB = cs0.b(this.g, twn.a(this.f, brm0.e(ua80.b(ua80.b(brm0.e(this.f21852a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31);
        String str = this.h;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoHeaderLargeTabs(navigationBarRightStyle=");
        sb.append(this.f21852a);
        sb.append(", navigationBarSearchViewExpanded=");
        sb.append(this.b);
        sb.append(", navigationBarSearchHint=");
        f140.v(sb, this.c, ", navigationBarSearchQuery=", this.d, ", enableSearchAutoFocus=");
        ua80.q(this.f, ", currentTab=", ", availableTabs=", sb, this.e);
        sb.append(this.g);
        sb.append(", navigationBarTitle=");
        sb.append(this.h);
        sb.append(", navigationBarSubtitle=");
        return axq.n(sb, this.i, Separators.RPAREN);
    }

    public /* synthetic */ mim(gmm gmmVar, boolean z, String str, String str2, boolean z2, int i, a4x a4xVar, String str3, int i2) {
        this(i, gmmVar, a4xVar, str, str2, (i2 & 128) != 0 ? null : str3, (String) null, z, z2);
    }
}
