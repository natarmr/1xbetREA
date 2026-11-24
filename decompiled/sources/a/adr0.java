package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class adr0 implements cdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f694a;
    public final xcr0 b;

    public adr0(imm immVar, xcr0 xcr0Var) {
        immVar.getClass();
        this.f694a = immVar;
        this.b = xcr0Var;
    }

    @Override // a.cdr0
    public final imm a() {
        return this.f694a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adr0)) {
            return false;
        }
        adr0 adr0Var = (adr0) obj;
        return Intrinsics.d(this.f694a, adr0Var.f694a) && Intrinsics.d(this.b, adr0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f694a.hashCode() * 31;
        xcr0 xcr0Var = this.b;
        return iHashCode + (xcr0Var == null ? 0 : xcr0Var.hashCode());
    }

    public final String toString() {
        return "Content(toolbar=" + this.f694a + ", tabs=" + this.b + Separators.RPAREN;
    }
}
