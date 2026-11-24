package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ad40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f661a;
    public final oc40 b;

    public ad40(l7m0 l7m0Var, oc40 oc40Var) {
        l7m0Var.getClass();
        this.f661a = l7m0Var;
        this.b = oc40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad40)) {
            return false;
        }
        ad40 ad40Var = (ad40) obj;
        return Intrinsics.d(this.f661a, ad40Var.f661a) && this.b.equals(ad40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f661a.hashCode() * 31);
    }

    public final String toString() {
        return "MetaHeroesUiState(toolbarState=" + this.f661a + ", screenState=" + this.b + Separators.RPAREN;
    }
}
