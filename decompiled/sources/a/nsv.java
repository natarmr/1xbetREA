package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nsv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24068a;

    public nsv(String str) {
        str.getClass();
        this.f24068a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nsv) && Intrinsics.d(this.f24068a, ((nsv) obj).f24068a);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof nsv) && (p6t0Var2 instanceof nsv)) {
            return Intrinsics.d(((nsv) p6t0Var).f24068a, ((nsv) p6t0Var2).f24068a);
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.f24068a.hashCode();
    }

    public final String toString() {
        return kng0.l("HeaderUiModel(title=", this.f24068a, Separators.RPAREN);
    }
}
