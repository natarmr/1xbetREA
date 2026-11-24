package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31231a;
    public final d280 b;

    public rws0(String str, d280 d280Var) {
        str.getClass();
        this.f31231a = str;
        this.b = d280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rws0)) {
            return false;
        }
        rws0 rws0Var = (rws0) obj;
        return Intrinsics.d(this.f31231a, rws0Var.f31231a) && Intrinsics.d(this.b, rws0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f31231a.hashCode() * 31;
        d280 d280Var = this.b;
        return iHashCode + (d280Var == null ? 0 : d280Var.hashCode());
    }

    public final String toString() {
        return "V2(opponentLabel=" + this.f31231a + ", opponentIcon=" + this.b + Separators.RPAREN;
    }
}
