package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tir0 implements bjr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34020a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public tir0(String str, String str2, boolean z, boolean z2) {
        str2.getClass();
        this.f34020a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tir0)) {
            return false;
        }
        tir0 tir0Var = (tir0) obj;
        return this.f34020a.equals(tir0Var.f34020a) && Intrinsics.d(this.b, tir0Var.b) && this.c == tir0Var.c && this.d == tir0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f34020a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", isAltDesign=", Separators.RPAREN, b1j.n("ShowBetModeDialog(totoName=", this.f34020a, ", outComeCount=", this.b, ", isPromoEnable="), this.c, this.d);
    }
}
