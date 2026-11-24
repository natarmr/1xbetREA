package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m4o0 implements n4o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tws0 f21182a;
    public final tws0 b;
    public final z1m c;
    public final String d;
    public final p0n e;

    public m4o0(z1m z1mVar, p0n p0nVar, tws0 tws0Var, tws0 tws0Var2, String str) {
        str.getClass();
        this.f21182a = tws0Var;
        this.b = tws0Var2;
        this.c = z1mVar;
        this.d = str;
        this.e = p0nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4o0)) {
            return false;
        }
        m4o0 m4o0Var = (m4o0) obj;
        return this.f21182a.equals(m4o0Var.f21182a) && this.b.equals(m4o0Var.b) && this.c.equals(m4o0Var.c) && Intrinsics.d(this.d, m4o0Var.d) && Intrinsics.d(this.e, m4o0Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(rz4.b(this.c.f43628a, (this.b.hashCode() + (this.f21182a.hashCode() * 31)) * 31, 31), 31, this.d);
        p0n p0nVar = this.e;
        return iB + (p0nVar == null ? 0 : p0nVar.hashCode());
    }

    public final String toString() {
        return "WinningFormula(firstOpponentModel=" + this.f21182a + ", secondOpponentModel=" + this.b + ", score=" + this.c + ", infoLabel=" + this.d + ", timer=" + this.e + Separators.RPAREN;
    }
}
