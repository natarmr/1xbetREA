package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class eo1 implements fo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f8119a;
    public final imm b;

    public eo1(imm immVar, a4x a4xVar) {
        a4xVar.getClass();
        immVar.getClass();
        this.f8119a = a4xVar;
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
        if (!(obj instanceof eo1)) {
            return false;
        }
        eo1 eo1Var = (eo1) obj;
        return Intrinsics.d(this.f8119a, eo1Var.f8119a) && Intrinsics.d(this.b, eo1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8119a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(categories=" + this.f8119a + ", navigationBarUiState=" + this.b + Separators.RPAREN;
    }
}
