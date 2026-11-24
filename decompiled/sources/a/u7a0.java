package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u7a0 implements x7a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f35176a;
    public final a4x b;

    public u7a0(imm immVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f35176a = immVar;
        this.b = a4xVar;
    }

    @Override // a.x7a0
    public final imm a() {
        return this.f35176a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7a0)) {
            return false;
        }
        u7a0 u7a0Var = (u7a0) obj;
        return this.f35176a.equals(u7a0Var.f35176a) && Intrinsics.d(this.b, u7a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35176a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(navigationBarModel=" + this.f35176a + ", itemsList=" + this.b + Separators.RPAREN;
    }
}
