package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bls0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f2809a;
    public final jks0 b;
    public final boolean c;

    public bls0(l7m0 l7m0Var, jks0 jks0Var, boolean z) {
        l7m0Var.getClass();
        this.f2809a = l7m0Var;
        this.b = jks0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bls0)) {
            return false;
        }
        bls0 bls0Var = (bls0) obj;
        return Intrinsics.d(this.f2809a, bls0Var.f2809a) && this.b.equals(bls0Var.b) && this.c == bls0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f2809a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransfersUiState(toolbarState=");
        sb.append(this.f2809a);
        sb.append(", screenState=");
        sb.append(this.b);
        sb.append(", resetScroll=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
