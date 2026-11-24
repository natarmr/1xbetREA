package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fxr0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10324a;

    public fxr0(float f) {
        this.f10324a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxr0) && ycl.b(this.f10324a, ((fxr0) obj).f10324a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f10324a);
    }

    public final String toString() {
        return kng0.l("TournamentBracketSpacerUiModel(height=", ycl.c(this.f10324a), Separators.RPAREN);
    }
}
