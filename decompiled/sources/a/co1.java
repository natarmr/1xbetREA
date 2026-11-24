package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class co1 implements fo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f4679a;
    public final imm b;

    public co1(imm immVar, a4x a4xVar) {
        a4xVar.getClass();
        immVar.getClass();
        this.f4679a = a4xVar;
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
        if (!(obj instanceof co1)) {
            return false;
        }
        co1 co1Var = (co1) obj;
        return Intrinsics.d(this.f4679a, co1Var.f4679a) && Intrinsics.d(this.b, co1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4679a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(categories=" + this.f4679a + ", navigationBarUiState=" + this.b + Separators.RPAREN;
    }
}
