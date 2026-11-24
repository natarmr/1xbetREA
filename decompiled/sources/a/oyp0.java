package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class oyp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26068a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public oyp0(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        this.f26068a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyp0)) {
            return false;
        }
        oyp0 oyp0Var = (oyp0) obj;
        return Intrinsics.d(this.f26068a, oyp0Var.f26068a) && this.b.equals(oyp0Var.b) && this.c == oyp0Var.c && this.d == oyp0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f26068a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", resetButtonEnabled=", Separators.RPAREN, b1j.n("TennisSummaryFiltersUiState(season=", this.f26068a, ", surfaceTypeName=", this.b, ", confirmButtonEnabled="), this.c, this.d);
    }
}
