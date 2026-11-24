package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class do1 implements fo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f6396a;
    public final imm b;

    public do1(mdm mdmVar, imm immVar) {
        immVar.getClass();
        this.f6396a = mdmVar;
        this.b = immVar;
    }

    @Override // a.fo1
    public final imm a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do1)) {
            return false;
        }
        do1 do1Var = (do1) obj;
        return this.f6396a.equals(do1Var.f6396a) && Intrinsics.d(this.b, do1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6396a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(config=" + this.f6396a + ", navigationBarUiState=" + this.b + Separators.RPAREN;
    }
}
