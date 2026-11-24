package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yf30 implements uqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f42522a;
    public final boolean b;
    public final jmo c;
    public final boolean d;

    public yf30(i4 i4Var, boolean z, jmo jmoVar, boolean z2) {
        i4Var.getClass();
        this.f42522a = i4Var;
        this.b = z;
        this.c = jmoVar;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf30)) {
            return false;
        }
        yf30 yf30Var = (yf30) obj;
        return Intrinsics.d(this.f42522a, yf30Var.f42522a) && this.b == yf30Var.b && this.c.equals(yf30Var.c) && this.d == yf30Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + brm0.e(this.f42522a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "MatchReviewUiModel(events=" + this.f42522a + ", expanded=" + this.b + ", btnUiModel=" + this.c + ", rtlSupport=" + this.d + Separators.RPAREN;
    }
}
