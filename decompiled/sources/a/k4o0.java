package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k4o0 implements n4o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tws0 f17679a;
    public final tws0 b;
    public final z1m c;
    public final String d;
    public final p0n e;

    public k4o0(z1m z1mVar, p0n p0nVar, tws0 tws0Var, tws0 tws0Var2, String str) {
        str.getClass();
        this.f17679a = tws0Var;
        this.b = tws0Var2;
        this.c = z1mVar;
        this.d = str;
        this.e = p0nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4o0)) {
            return false;
        }
        k4o0 k4o0Var = (k4o0) obj;
        return this.f17679a.equals(k4o0Var.f17679a) && this.b.equals(k4o0Var.b) && this.c.equals(k4o0Var.c) && Intrinsics.d(this.d, k4o0Var.d) && Intrinsics.d(this.e, k4o0Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(rz4.b(this.c.f43628a, (this.b.hashCode() + (this.f17679a.hashCode() * 31)) * 31, 31), 31, this.d);
        p0n p0nVar = this.e;
        return iB + (p0nVar == null ? 0 : p0nVar.hashCode());
    }

    public final String toString() {
        return "Fighting(firstOpponentModel=" + this.f17679a + ", secondOpponentModel=" + this.b + ", score=" + this.c + ", infoLabel=" + this.d + ", timer=" + this.e + Separators.RPAREN;
    }
}
