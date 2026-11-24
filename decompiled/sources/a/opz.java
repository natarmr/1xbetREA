package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class opz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final piq0 f25663a;
    public final x85 b;
    public final boolean c;

    public opz(piq0 piq0Var, x85 x85Var, boolean z) {
        this.f25663a = piq0Var;
        this.b = x85Var;
        this.c = z;
    }

    public static opz a(opz opzVar, piq0 piq0Var, x85 x85Var, boolean z, int i) {
        if ((i & 1) != 0) {
            piq0Var = opzVar.f25663a;
        }
        if ((i & 2) != 0) {
            x85Var = opzVar.b;
        }
        if ((i & 4) != 0) {
            z = opzVar.c;
        }
        opzVar.getClass();
        return new opz(piq0Var, x85Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opz)) {
            return false;
        }
        opz opzVar = (opz) obj;
        return Intrinsics.d(this.f25663a, opzVar.f25663a) && Intrinsics.d(this.b, opzVar.b) && this.c == opzVar.c;
    }

    public final int hashCode() {
        piq0 piq0Var = this.f25663a;
        int iHashCode = (piq0Var == null ? 0 : piq0Var.hashCode()) * 31;
        x85 x85Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (x85Var != null ? x85Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitSelfExcludeEeState(availableTimeLimit=");
        sb.append(this.f25663a);
        sb.append(", selectedLimit=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
