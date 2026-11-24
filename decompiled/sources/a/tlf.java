package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tlf implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34141a;
    public final String b;
    public final int c;

    public tlf(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f34141a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlf)) {
            return false;
        }
        tlf tlfVar = (tlf) obj;
        return Intrinsics.d(this.f34141a, tlfVar.f34141a) && Intrinsics.d(this.b, tlfVar.b) && this.c == tlfVar.c;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return axq.f(p6t0Var, p6t0Var2).equals(p6t0Var2.getClass());
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f34141a.hashCode() * 31, 31, this.b);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("Cs2GameLogRoundFinishedUiModel(title=", this.f34141a, ", winner=", this.b, ", background="));
    }
}
