package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f44273a;
    public final l7m0 b;

    public zew(l7m0 l7m0Var, l7m0 l7m0Var2) {
        l7m0Var.getClass();
        l7m0Var2.getClass();
        this.f44273a = l7m0Var;
        this.b = l7m0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zew)) {
            return false;
        }
        zew zewVar = (zew) obj;
        return Intrinsics.d(this.f44273a, zewVar.f44273a) && Intrinsics.d(this.b, zewVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44273a.hashCode() * 31);
    }

    public final String toString() {
        return "HltvAwardsUiState(toolBarState=" + this.f44273a + ", screenState=" + this.b + Separators.RPAREN;
    }
}
