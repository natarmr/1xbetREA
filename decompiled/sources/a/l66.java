package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l66 implements o66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tws0 f19490a;
    public final tws0 b;
    public final z1m c;
    public final String d;
    public final p0n e;

    public l66(z1m z1mVar, p0n p0nVar, tws0 tws0Var, tws0 tws0Var2, String str) {
        str.getClass();
        this.f19490a = tws0Var;
        this.b = tws0Var2;
        this.c = z1mVar;
        this.d = str;
        this.e = p0nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l66)) {
            return false;
        }
        l66 l66Var = (l66) obj;
        return this.f19490a.equals(l66Var.f19490a) && this.b.equals(l66Var.b) && this.c.equals(l66Var.c) && Intrinsics.d(this.d, l66Var.d) && Intrinsics.d(this.e, l66Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(rz4.b(this.c.f43628a, (this.b.hashCode() + (this.f19490a.hashCode() * 31)) * 31, 31), 31, this.d);
        p0n p0nVar = this.e;
        return iB + (p0nVar == null ? 0 : p0nVar.hashCode());
    }

    public final String toString() {
        return "Tennis(firstOpponentModel=" + this.f19490a + ", secondOpponentModel=" + this.b + ", score=" + this.c + ", infoLabel=" + this.d + ", timer=" + this.e + Separators.RPAREN;
    }
}
