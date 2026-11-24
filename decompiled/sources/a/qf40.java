package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class qf40 implements tf40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f28612a;

    public qf40(i4 i4Var) {
        i4Var.getClass();
        this.f28612a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qf40) && Intrinsics.d(this.f28612a, ((qf40) obj).f28612a);
    }

    @Override // a.tf40
    public final String getKey() {
        String strJ = sre0.f32672a.b(qf40.class).J();
        return strJ == null ? "" : strJ;
    }

    public final int hashCode() {
        return this.f28612a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f28612a, "TopGames(model=", Separators.RPAREN);
    }
}
