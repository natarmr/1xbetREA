package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yhz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f42660a;
    public final ahz b;
    public final boolean c;
    public final boolean d;

    public yhz(l7m0 l7m0Var, ahz ahzVar, boolean z, boolean z2) {
        l7m0Var.getClass();
        this.f42660a = l7m0Var;
        this.b = ahzVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhz)) {
            return false;
        }
        yhz yhzVar = (yhz) obj;
        return Intrinsics.d(this.f42660a, yhzVar.f42660a) && this.b.equals(yhzVar.b) && this.c == yhzVar.c && this.d == yhzVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e((this.b.hashCode() + (this.f42660a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardUiState(toolbarState=");
        sb.append(this.f42660a);
        sb.append(", screenState=");
        sb.append(this.b);
        sb.append(", resetScroll=");
        return ohs0.p(", filtersVisible=", Separators.RPAREN, sb, this.c, this.d);
    }
}
