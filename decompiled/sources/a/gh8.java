package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gh8 implements jh8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ian f11284a;
    public final csr b;

    public gh8(ian ianVar, csr csrVar) {
        csrVar.getClass();
        this.f11284a = ianVar;
        this.b = csrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh8)) {
            return false;
        }
        gh8 gh8Var = (gh8) obj;
        return this.f11284a.equals(gh8Var.f11284a) && Intrinsics.d(this.b, gh8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11284a.hashCode() * 31);
    }

    public final String toString() {
        return "BonusInGame(cellUiModel=" + this.f11284a + ", gameBonus=" + this.b + Separators.RPAREN;
    }
}
