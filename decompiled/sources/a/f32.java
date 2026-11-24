package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class f32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e32 f8840a;
    public final int b;

    public f32(e32 e32Var, int i) {
        this.f8840a = e32Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f32)) {
            return false;
        }
        f32 f32Var = (f32) obj;
        return this.f8840a == f32Var.f8840a && this.b == f32Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f8840a.hashCode() * 31);
    }

    public final String toString() {
        return "AllEventGamesLottieStateModel(lottieErrorType=" + this.f8840a + ", lottieType=" + this.b + Separators.RPAREN;
    }
}
