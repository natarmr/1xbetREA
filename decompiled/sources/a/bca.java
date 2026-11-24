package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2346a;
    public final d280 b;

    public bca(c280 c280Var, String str) {
        str.getClass();
        this.f2346a = str;
        this.b = c280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bca)) {
            return false;
        }
        bca bcaVar = (bca) obj;
        return Intrinsics.d(this.f2346a, bcaVar.f2346a) && Intrinsics.d(this.b, bcaVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f2346a.hashCode() * 31;
        d280 d280Var = this.b;
        return iHashCode + (d280Var == null ? 0 : d280Var.hashCode());
    }

    public final String toString() {
        return "Default(opponentLabel=" + this.f2346a + ", opponentIcon=" + this.b + Separators.RPAREN;
    }
}
