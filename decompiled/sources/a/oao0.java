package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oao0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24938a;
    public final String b;
    public final int c;
    public final Integer d;
    public final boolean e;
    public final String f;

    public oao0(String str, String str2, int i, Integer num, boolean z, String str3) {
        str2.getClass();
        this.f24938a = str;
        this.b = str2;
        this.c = i;
        this.d = num;
        this.e = z;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oao0)) {
            return false;
        }
        oao0 oao0Var = (oao0) obj;
        return this.f24938a.equals(oao0Var.f24938a) && Intrinsics.d(this.b, oao0Var.b) && this.c == oao0Var.c && Intrinsics.d(this.d, oao0Var.d) && this.e == oao0Var.e && Intrinsics.d(this.f, oao0Var.f);
    }

    public final int hashCode() {
        int iA = twn.a(this.c, ua80.b(this.f24938a.hashCode() * 31, 31, this.b), 31);
        Integer num = this.d;
        int iE = brm0.e(brm0.e((iA + (num == null ? 0 : num.hashCode())) * 31, 961, this.e), 31, false);
        String str = this.f;
        return iE + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TabBarTabDSModel(tag=", this.f24938a, ", description=", this.b, ", icon=");
        sbN.append(this.c);
        sbN.append(", logo=");
        sbN.append(this.d);
        sbN.append(", isCentral=");
        return twn.q(", counterValue=null, badge=false, largeTabIconUrl=", this.f, Separators.RPAREN, sbN, this.e);
    }
}
