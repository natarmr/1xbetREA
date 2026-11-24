package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class iy5 extends zy5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csr f15573a;

    public iy5(csr csrVar) {
        csrVar.getClass();
        this.f15573a = csrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iy5) && Intrinsics.d(this.f15573a, ((iy5) obj).f15573a);
    }

    public final int hashCode() {
        return this.f15573a.hashCode();
    }

    public final String toString() {
        return "ChangeBonusCommand(bonus=" + this.f15573a + Separators.RPAREN;
    }
}
