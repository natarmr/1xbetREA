package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fh8 implements jh8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lan f9528a;
    public final csr b;

    public fh8(lan lanVar, csr csrVar) {
        csrVar.getClass();
        this.f9528a = lanVar;
        this.b = csrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh8)) {
            return false;
        }
        fh8 fh8Var = (fh8) obj;
        return this.f9528a.equals(fh8Var.f9528a) && Intrinsics.d(this.b, fh8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9528a.hashCode() * 31);
    }

    public final String toString() {
        return "Bonus(cellUiModel=" + this.f9528a + ", gameBonus=" + this.b + Separators.RPAREN;
    }
}
