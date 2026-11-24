package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h3b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12376a;
    public final int b;
    public final boolean c;
    public final a4x d;

    public h3b(boolean z, int i, boolean z2, a4x a4xVar) {
        a4xVar.getClass();
        this.f12376a = z;
        this.b = i;
        this.c = z2;
        this.d = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3b)) {
            return false;
        }
        h3b h3bVar = (h3b) obj;
        return this.f12376a == h3bVar.f12376a && this.b == h3bVar.b && this.c == h3bVar.c && Intrinsics.d(this.d, h3bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(twn.a(this.b, Boolean.hashCode(this.f12376a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = ohs0.t(this.b, "CategoriesUiState(visible=", ", activeChipId=", ", isFilterActive=", this.f12376a);
        sbT.append(this.c);
        sbT.append(", chips=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
