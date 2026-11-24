package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d4s0 implements e4s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f5471a;
    public final mdm b;

    public d4s0(mdm mdmVar, imm immVar) {
        immVar.getClass();
        mdmVar.getClass();
        this.f5471a = immVar;
        this.b = mdmVar;
    }

    @Override // a.e4s0
    public final imm a() {
        return this.f5471a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4s0)) {
            return false;
        }
        d4s0 d4s0Var = (d4s0) obj;
        return Intrinsics.d(this.f5471a, d4s0Var.f5471a) && Intrinsics.d(this.b, d4s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5471a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(navigationBar=" + this.f5471a + ", emptyConfig=" + this.b + Separators.RPAREN;
    }
}
