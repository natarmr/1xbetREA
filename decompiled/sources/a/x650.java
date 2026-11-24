package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x650 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f40344a;
    public final z250 b;
    public final n250 c;

    public x650(imm immVar, z250 z250Var, n250 n250Var) {
        immVar.getClass();
        z250Var.getClass();
        n250Var.getClass();
        this.f40344a = immVar;
        this.b = z250Var;
        this.c = n250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x650)) {
            return false;
        }
        x650 x650Var = (x650) obj;
        return Intrinsics.d(this.f40344a, x650Var.f40344a) && Intrinsics.d(this.b, x650Var.b) && Intrinsics.d(this.c, x650Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f40344a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MyAggregatorUiState(navBarModel=" + this.f40344a + ", headerContent=" + this.b + ", bodyContent=" + this.c + Separators.RPAREN;
    }
}
