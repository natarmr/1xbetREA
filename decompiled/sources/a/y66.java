package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y66 implements e76 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rws0 f42081a;
    public final rws0 b;
    public final String c;
    public final p0n d;
    public final f2i e;

    public y66(d2i d2iVar, p0n p0nVar, rws0 rws0Var, rws0 rws0Var2, String str) {
        str.getClass();
        this.f42081a = rws0Var;
        this.b = rws0Var2;
        this.c = str;
        this.d = p0nVar;
        this.e = d2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y66)) {
            return false;
        }
        y66 y66Var = (y66) obj;
        return this.f42081a.equals(y66Var.f42081a) && this.b.equals(y66Var.b) && Intrinsics.d(this.c, y66Var.c) && Intrinsics.d(this.d, y66Var.d) && Intrinsics.d(this.e, y66Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b((this.b.hashCode() + (this.f42081a.hashCode() * 31)) * 31, 31, this.c);
        p0n p0nVar = this.d;
        int iHashCode = (iB + (p0nVar == null ? 0 : p0nVar.hashCode())) * 31;
        f2i f2iVar = this.e;
        return iHashCode + (f2iVar != null ? f2iVar.hashCode() : 0);
    }

    public final String toString() {
        return "Cyber(firstOpponentModel=" + this.f42081a + ", secondOpponentModel=" + this.b + ", infoLabel=" + this.c + ", timer=" + this.d + ", broadcastIndicatorModel=" + this.e + Separators.RPAREN;
    }
}
