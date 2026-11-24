package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cr3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4823a;
    public final dr3 b;

    public cr3(String str, dr3 dr3Var) {
        str.getClass();
        dr3Var.getClass();
        this.f4823a = str;
        this.b = dr3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr3)) {
            return false;
        }
        cr3 cr3Var = (cr3) obj;
        return Intrinsics.d(this.f4823a, cr3Var.f4823a) && Intrinsics.d(this.b, cr3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4823a.hashCode() * 31);
    }

    public final String toString() {
        return "AppleFortuneScreenUiModel(currency=" + this.f4823a + ", gameStateModel=" + this.b + Separators.RPAREN;
    }
}
