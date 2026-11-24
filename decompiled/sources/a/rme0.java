package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rme0 implements tme0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f30740a;
    public final a4x b;

    public rme0(imm immVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f30740a = immVar;
        this.b = a4xVar;
    }

    @Override // a.tme0
    public final imm a() {
        return this.f30740a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rme0)) {
            return false;
        }
        rme0 rme0Var = (rme0) obj;
        return this.f30740a.equals(rme0Var.f30740a) && Intrinsics.d(this.b, rme0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30740a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(dsNavigationBarUiModel=" + this.f30740a + ", refereeItemList=" + this.b + Separators.RPAREN;
    }
}
