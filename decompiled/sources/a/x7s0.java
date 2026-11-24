package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x7s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f40429a;
    public final zzr0 b;

    public x7s0(a4x a4xVar, zzr0 zzr0Var) {
        a4xVar.getClass();
        this.f40429a = a4xVar;
        this.b = zzr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7s0)) {
            return false;
        }
        x7s0 x7s0Var = (x7s0) obj;
        return Intrinsics.d(this.f40429a, x7s0Var.f40429a) && this.b == x7s0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40429a.hashCode() * 31);
    }

    public final String toString() {
        return "TournamentTableColumnsUiModel(columnValues=" + this.f40429a + ", columnType=" + this.b + Separators.RPAREN;
    }
}
