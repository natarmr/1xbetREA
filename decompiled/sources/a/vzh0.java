package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vzh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f38300a;
    public final l7m0 b;

    public vzh0(l7m0 l7m0Var, l7m0 l7m0Var2) {
        l7m0Var2.getClass();
        this.f38300a = l7m0Var;
        this.b = l7m0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vzh0) {
            vzh0 vzh0Var = (vzh0) obj;
            if (this.f38300a == vzh0Var.f38300a && Intrinsics.d(this.b, vzh0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38300a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectAwardUiState(toolBarState=" + this.f38300a + ", screenState=" + this.b + Separators.RPAREN;
    }
}
