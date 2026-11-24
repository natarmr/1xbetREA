package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dlg0 implements glg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6280a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public dlg0(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        str3.getClass();
        str4.getClass();
        this.f6280a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlg0)) {
            return false;
        }
        dlg0 dlg0Var = (dlg0) obj;
        return this.f6280a.equals(dlg0Var.f6280a) && this.b.equals(dlg0Var.b) && Intrinsics.d(this.c, dlg0Var.c) && Intrinsics.d(this.d, dlg0Var.d) && this.e == dlg0Var.e && this.f == dlg0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(ua80.b(ua80.b(ua80.b(this.f6280a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ImageRule(imageUrl=", this.f6280a, ", imageUrlFallback=", this.b, ", text=");
        f140.v(sbN, this.c, ", link=", this.d, ", isDeeplink=");
        return ohs0.p(", isRuleCover=", Separators.RPAREN, sbN, this.e, this.f);
    }
}
