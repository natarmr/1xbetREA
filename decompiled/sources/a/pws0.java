package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27726a;
    public final d280 b;

    public pws0(String str, d280 d280Var) {
        str.getClass();
        this.f27726a = str;
        this.b = d280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pws0)) {
            return false;
        }
        pws0 pws0Var = (pws0) obj;
        return Intrinsics.d(this.f27726a, pws0Var.f27726a) && Intrinsics.d(this.b, pws0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f27726a.hashCode() * 31;
        d280 d280Var = this.b;
        return iHashCode + (d280Var == null ? 0 : d280Var.hashCode());
    }

    public final String toString() {
        return "Default(opponentLabel=" + this.f27726a + ", opponentIcon=" + this.b + Separators.RPAREN;
    }
}
