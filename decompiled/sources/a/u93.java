package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f35262a;
    public final imm b;

    public u93(imm immVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f35262a = a4xVar;
        this.b = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u93)) {
            return false;
        }
        u93 u93Var = (u93) obj;
        return Intrinsics.d(this.f35262a, u93Var.f35262a) && this.b.equals(u93Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35262a.hashCode() * 31);
    }

    public final String toString() {
        return "AnotherAwardsUiStateModel(itemList=" + this.f35262a + ", navigationBarUiModel=" + this.b + Separators.RPAREN;
    }
}
