package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xf30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f40773a;
    public final imo b;

    public xf30(i4 i4Var, imo imoVar) {
        i4Var.getClass();
        this.f40773a = i4Var;
        this.b = imoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf30)) {
            return false;
        }
        xf30 xf30Var = (xf30) obj;
        return Intrinsics.d(this.f40773a, xf30Var.f40773a) && this.b.equals(xf30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40773a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchReviewUiModel(events=" + this.f40773a + ", btnUiModel=" + this.b + Separators.RPAREN;
    }
}
