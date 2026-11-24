package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g7s0 implements h7s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f10832a;
    public final mdm b;

    public g7s0(mdm mdmVar, imm immVar) {
        immVar.getClass();
        mdmVar.getClass();
        this.f10832a = immVar;
        this.b = mdmVar;
    }

    @Override // a.h7s0
    public final imm a() {
        return this.f10832a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7s0)) {
            return false;
        }
        g7s0 g7s0Var = (g7s0) obj;
        return Intrinsics.d(this.f10832a, g7s0Var.f10832a) && Intrinsics.d(this.b, g7s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10832a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(navigationBar=" + this.f10832a + ", emptyConfig=" + this.b + Separators.RPAREN;
    }
}
