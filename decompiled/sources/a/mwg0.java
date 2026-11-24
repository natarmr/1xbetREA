package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mwg0 implements owg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22501a;
    public final String b;
    public final String c;
    public final boolean d;

    public mwg0(String str, String str2, String str3, boolean z) {
        str.getClass();
        str3.getClass();
        this.f22501a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwg0)) {
            return false;
        }
        mwg0 mwg0Var = (mwg0) obj;
        return Intrinsics.d(this.f22501a, mwg0Var.f22501a) && this.b.equals(mwg0Var.b) && Intrinsics.d(this.c, mwg0Var.c) && this.d == mwg0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(this.f22501a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return defpackage.c.c(this.c, ", hideCoupon=", Separators.RPAREN, b1j.n("ShowSuccessfulAlternativeSale(title=", this.f22501a, ", description=", this.b, ", betId="), this.d);
    }
}
