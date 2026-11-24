package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fjv implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f9662a;
    public final a4x b;

    public fjv(hjm hjmVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f9662a = hjmVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjv)) {
            return false;
        }
        fjv fjvVar = (fjv) obj;
        return this.f9662a.equals(fjvVar.f9662a) && Intrinsics.d(this.b, fjvVar.b);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return Intrinsics.d(p6t0Var.getKey(), p6t0Var2.getKey());
    }

    @Override // a.p6t0
    public final String getKey() {
        return "GUILTY_GEAR_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.b.hashCode() + hne.e(this.f9662a, -1410544088, 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        return "GuiltyGearUiModel(key=GUILTY_GEAR_KEY, header=" + this.f9662a + ", rounds=" + this.b + Separators.RPAREN;
    }
}
