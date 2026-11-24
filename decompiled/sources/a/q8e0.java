package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q8e0 implements t8e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g8e0 f28295a;
    public final f9m0 b;
    public final boolean c;
    public final mdm d;

    public q8e0(g8e0 g8e0Var, f9m0 f9m0Var, boolean z, mdm mdmVar) {
        g8e0Var.getClass();
        f9m0Var.getClass();
        this.f28295a = g8e0Var;
        this.b = f9m0Var;
        this.c = z;
        this.d = mdmVar;
    }

    @Override // a.t8e0
    public final boolean a() {
        return this.c;
    }

    @Override // a.t8e0
    public final g8e0 b() {
        return this.f28295a;
    }

    @Override // a.t8e0
    public final f9m0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8e0)) {
            return false;
        }
        q8e0 q8e0Var = (q8e0) obj;
        return Intrinsics.d(this.f28295a, q8e0Var.f28295a) && Intrinsics.d(this.b, q8e0Var.b) && this.c == q8e0Var.c && this.d.equals(q8e0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e((this.b.hashCode() + (this.f28295a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Error(headerUiState=" + this.f28295a + ", appBarUiModel=" + this.b + ", rtlSupport=" + this.c + ", lottieConfig=" + this.d + Separators.RPAREN;
    }
}
