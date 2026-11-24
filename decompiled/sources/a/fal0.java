package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fal0 implements pal0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9214a;
    public final pep0 b;
    public final e5a0 c;

    public fal0(String str, pep0 pep0Var, e5a0 e5a0Var) {
        str.getClass();
        this.f9214a = str;
        this.b = pep0Var;
        this.c = e5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fal0)) {
            return false;
        }
        fal0 fal0Var = (fal0) obj;
        return Intrinsics.d(this.f9214a, fal0Var.f9214a) && this.b == fal0Var.b && this.c.equals(fal0Var.c);
    }

    public final int hashCode() {
        return this.c.f7225a.hashCode() + ((this.b.hashCode() + (this.f9214a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MultiTeams(name=" + this.f9214a + ", order=" + this.b + ", playerIcon=" + this.c + Separators.RPAREN;
    }
}
