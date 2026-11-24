package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ppz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f27393a;
    public final boolean b;
    public final boolean c;

    public ppz(a4x a4xVar, boolean z, boolean z2) {
        a4xVar.getClass();
        this.f27393a = a4xVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppz)) {
            return false;
        }
        ppz ppzVar = (ppz) obj;
        return Intrinsics.d(this.f27393a, ppzVar.f27393a) && this.b == ppzVar.b && this.c == ppzVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f27393a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitSelfExcludeEeUiState(availableValueModels=");
        sb.append(this.f27393a);
        sb.append(", acceptButtonEnabled=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
