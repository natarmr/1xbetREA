package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a0n0 implements d0n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2n0 f34a;
    public final boolean b;

    public a0n0(e2n0 e2n0Var, boolean z) {
        e2n0Var.getClass();
        this.f34a = e2n0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0n0)) {
            return false;
        }
        a0n0 a0n0Var = (a0n0) obj;
        return Intrinsics.d(this.f34a, a0n0Var.f34a) && this.b == a0n0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f34a.hashCode() * 31);
    }

    public final String toString() {
        return "OnToggleClick(subSectionToggleItem=" + this.f34a + ", selected=" + this.b + Separators.RPAREN;
    }
}
