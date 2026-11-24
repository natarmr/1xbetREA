package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n8s0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23104a;
    public final String b = String.valueOf(sre0.f32672a.b(n8s0.class).J());

    public n8s0(ArrayList arrayList) {
        this.f23104a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8s0) && this.f23104a.equals(((n8s0) obj).f23104a);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return Intrinsics.d(p6t0Var.getKey(), p6t0Var2.getKey());
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.f23104a.hashCode();
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        return hne.o("TournamentTopTeamsUiModel(items=", Separators.RPAREN, this.f23104a);
    }
}
