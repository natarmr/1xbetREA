package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class g6s0 implements h6s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f10784a;
    public final mdm b;

    public g6s0(mdm mdmVar, imm immVar) {
        immVar.getClass();
        mdmVar.getClass();
        this.f10784a = immVar;
        this.b = mdmVar;
    }

    @Override // a.h6s0
    public final imm a() {
        return this.f10784a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6s0)) {
            return false;
        }
        g6s0 g6s0Var = (g6s0) obj;
        return Intrinsics.d(this.f10784a, g6s0Var.f10784a) && Intrinsics.d(this.b, g6s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10784a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(navigationBar=" + this.f10784a + ", emptyConfig=" + this.b + Separators.RPAREN;
    }
}
