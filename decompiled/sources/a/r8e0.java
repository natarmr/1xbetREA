package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r8e0 implements t8e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g8e0 f30021a;
    public final f9m0 b;
    public final boolean c;

    public r8e0(g8e0 g8e0Var, f9m0 f9m0Var, boolean z) {
        g8e0Var.getClass();
        f9m0Var.getClass();
        this.f30021a = g8e0Var;
        this.b = f9m0Var;
        this.c = z;
    }

    @Override // a.t8e0
    public final boolean a() {
        return this.c;
    }

    @Override // a.t8e0
    public final g8e0 b() {
        return this.f30021a;
    }

    @Override // a.t8e0
    public final f9m0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8e0)) {
            return false;
        }
        r8e0 r8e0Var = (r8e0) obj;
        return Intrinsics.d(this.f30021a, r8e0Var.f30021a) && Intrinsics.d(this.b, r8e0Var.b) && this.c == r8e0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f30021a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(headerUiState=");
        sb.append(this.f30021a);
        sb.append(", appBarUiModel=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
