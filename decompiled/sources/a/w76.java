package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w76 implements b86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uws0 f38656a;
    public final uws0 b;
    public final kpm c;
    public final String d;
    public final r0n e;

    public w76(uws0 uws0Var, uws0 uws0Var2, kpm kpmVar, String str, r0n r0nVar) {
        str.getClass();
        this.f38656a = uws0Var;
        this.b = uws0Var2;
        this.c = kpmVar;
        this.d = str;
        this.e = r0nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w76)) {
            return false;
        }
        w76 w76Var = (w76) obj;
        return this.f38656a.equals(w76Var.f38656a) && this.b.equals(w76Var.b) && this.c.equals(w76Var.c) && Intrinsics.d(this.d, w76Var.d) && this.e.equals(w76Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(dw9.c(this.c, (this.b.hashCode() + (this.f38656a.hashCode() * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        return "MultiTeams(firstOpponentModel=" + this.f38656a + ", secondOpponentModel=" + this.b + ", score=" + this.c + ", infoLabel=" + this.d + ", options=" + this.e + Separators.RPAREN;
    }
}
