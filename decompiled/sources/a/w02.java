package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w02 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f38327a;
    public final n4i0 b;
    public final boolean c;

    public w02(a4x a4xVar, n4i0 n4i0Var, boolean z) {
        a4xVar.getClass();
        this.f38327a = a4xVar;
        this.b = n4i0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w02)) {
            return false;
        }
        w02 w02Var = (w02) obj;
        return Intrinsics.d(this.f38327a, w02Var.f38327a) && this.b.equals(w02Var.b) && this.c == w02Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f38327a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AimPlayersUiModel(teamLineUp=");
        sb.append(this.f38327a);
        sb.append(", selectedPlayerAim=");
        sb.append(this.b);
        sb.append(", tablet=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
