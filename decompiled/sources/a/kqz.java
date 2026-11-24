package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class kqz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f18741a;
    public final boolean b;
    public final boolean c;

    public kqz(a4x a4xVar, boolean z, boolean z2) {
        a4xVar.getClass();
        this.f18741a = a4xVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqz)) {
            return false;
        }
        kqz kqzVar = (kqz) obj;
        return Intrinsics.d(this.f18741a, kqzVar.f18741a) && this.b == kqzVar.b && this.c == kqzVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f18741a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitSelfExcludeKenyaUiState(availableValueModels=");
        sb.append(this.f18741a);
        sb.append(", acceptButtonEnabled=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
