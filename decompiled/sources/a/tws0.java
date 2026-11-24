package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34667a;
    public final d280 b;

    public tws0(String str, d280 d280Var) {
        str.getClass();
        this.f34667a = str;
        this.b = d280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tws0)) {
            return false;
        }
        tws0 tws0Var = (tws0) obj;
        return Intrinsics.d(this.f34667a, tws0Var.f34667a) && this.b.equals(tws0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34667a.hashCode() * 31);
    }

    public final String toString() {
        return "V4(opponentLabel=" + this.f34667a + ", opponentIcon=" + this.b + Separators.RPAREN;
    }
}
