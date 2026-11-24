package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y4p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f42014a;
    public final boolean b;
    public final d4p c;

    public y4p(imm immVar, boolean z, d4p d4pVar) {
        immVar.getClass();
        this.f42014a = immVar;
        this.b = z;
        this.c = d4pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4p)) {
            return false;
        }
        y4p y4pVar = (y4p) obj;
        return Intrinsics.d(this.f42014a, y4pVar.f42014a) && this.b == y4pVar.b && this.c.equals(y4pVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f42014a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "FavoriteCategoryScreenUiState(headerModel=" + this.f42014a + ", isRefreshing=" + this.b + ", contentUiState=" + this.c + Separators.RPAREN;
    }
}
