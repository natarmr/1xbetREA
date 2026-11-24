package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s8e0 implements t8e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g8e0 f31796a;
    public final f9m0 b;
    public final boolean c;
    public final p8e0 d;

    public s8e0(g8e0 g8e0Var, f9m0 f9m0Var, boolean z, p8e0 p8e0Var) {
        g8e0Var.getClass();
        f9m0Var.getClass();
        p8e0Var.getClass();
        this.f31796a = g8e0Var;
        this.b = f9m0Var;
        this.c = z;
        this.d = p8e0Var;
    }

    @Override // a.t8e0
    public final boolean a() {
        return this.c;
    }

    @Override // a.t8e0
    public final g8e0 b() {
        return this.f31796a;
    }

    @Override // a.t8e0
    public final f9m0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8e0)) {
            return false;
        }
        s8e0 s8e0Var = (s8e0) obj;
        return Intrinsics.d(this.f31796a, s8e0Var.f31796a) && Intrinsics.d(this.b, s8e0Var.b) && this.c == s8e0Var.c && Intrinsics.d(this.d, s8e0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e((this.b.hashCode() + (this.f31796a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Success(headerUiState=" + this.f31796a + ", appBarUiModel=" + this.b + ", rtlSupport=" + this.c + ", tableUiModel=" + this.d + Separators.RPAREN;
    }
}
