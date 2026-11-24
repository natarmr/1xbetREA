package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bdr0 implements cdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f2413a;
    public final mdm b;

    public bdr0(mdm mdmVar, imm immVar) {
        immVar.getClass();
        mdmVar.getClass();
        this.f2413a = immVar;
        this.b = mdmVar;
    }

    @Override // a.cdr0
    public final imm a() {
        return this.f2413a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdr0)) {
            return false;
        }
        bdr0 bdr0Var = (bdr0) obj;
        return Intrinsics.d(this.f2413a, bdr0Var.f2413a) && Intrinsics.d(this.b, bdr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2413a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(toolbar=" + this.f2413a + ", config=" + this.b + Separators.RPAREN;
    }
}
