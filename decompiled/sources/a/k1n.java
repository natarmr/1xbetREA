package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k1n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17534a;
    public final d280 b;

    public k1n(String str, d280 d280Var) {
        str.getClass();
        this.f17534a = str;
        this.b = d280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1n)) {
            return false;
        }
        k1n k1nVar = (k1n) obj;
        return Intrinsics.d(this.f17534a, k1nVar.f17534a) && Intrinsics.d(this.b, k1nVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f17534a.hashCode() * 31;
        d280 d280Var = this.b;
        return iHashCode + (d280Var == null ? 0 : d280Var.hashCode());
    }

    public final String toString() {
        return "V3(opponentLabel=" + this.f17534a + ", opponentIcon=" + this.b + Separators.RPAREN;
    }
}
