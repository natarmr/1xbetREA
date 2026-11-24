package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class jqz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qiq0 f16978a;
    public final y85 b;
    public final boolean c;

    public jqz(qiq0 qiq0Var, y85 y85Var, boolean z) {
        this.f16978a = qiq0Var;
        this.b = y85Var;
        this.c = z;
    }

    public static jqz a(jqz jqzVar, qiq0 qiq0Var, y85 y85Var, boolean z, int i) {
        if ((i & 1) != 0) {
            qiq0Var = jqzVar.f16978a;
        }
        if ((i & 2) != 0) {
            y85Var = jqzVar.b;
        }
        if ((i & 4) != 0) {
            z = jqzVar.c;
        }
        jqzVar.getClass();
        return new jqz(qiq0Var, y85Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqz)) {
            return false;
        }
        jqz jqzVar = (jqz) obj;
        return Intrinsics.d(this.f16978a, jqzVar.f16978a) && Intrinsics.d(this.b, jqzVar.b) && this.c == jqzVar.c;
    }

    public final int hashCode() {
        qiq0 qiq0Var = this.f16978a;
        int iHashCode = (qiq0Var == null ? 0 : qiq0Var.hashCode()) * 31;
        y85 y85Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (y85Var != null ? y85Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitSelfExcludeKenyaState(availableTimeLimit=");
        sb.append(this.f16978a);
        sb.append(", selectedLimit=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
