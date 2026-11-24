package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u2n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f34955a;
    public final o2n0 b;
    public final a4x c;

    public u2n0(imm immVar, o2n0 o2n0Var, a4x a4xVar) {
        a4xVar.getClass();
        this.f34955a = immVar;
        this.b = o2n0Var;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2n0)) {
            return false;
        }
        u2n0 u2n0Var = (u2n0) obj;
        return this.f34955a.equals(u2n0Var.f34955a) && this.b.equals(u2n0Var.b) && Intrinsics.d(this.c, u2n0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f34955a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubSectionUiState(navigationBar=");
        sb.append(this.f34955a);
        sb.append(", subSectionType=");
        sb.append(this.b);
        sb.append(", menuItems=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
