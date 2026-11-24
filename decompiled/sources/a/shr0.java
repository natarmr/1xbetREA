package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class shr0 implements xhr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32228a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public shr0(String str, String str2, boolean z, boolean z2) {
        str2.getClass();
        this.f32228a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shr0)) {
            return false;
        }
        shr0 shr0Var = (shr0) obj;
        return this.f32228a.equals(shr0Var.f32228a) && Intrinsics.d(this.b, shr0Var.b) && this.c == shr0Var.c && this.d == shr0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f32228a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", isAltDesign=", Separators.RPAREN, b1j.n("ShowBetModeDialog(totoName=", this.f32228a, ", outComeCount=", this.b, ", isPromoEnable="), this.c, this.d);
    }
}
