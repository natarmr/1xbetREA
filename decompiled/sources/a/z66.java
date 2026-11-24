package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z66 implements e76 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rws0 f43850a;
    public final rws0 b;
    public final p0n c;
    public final String d;
    public final f2i e;

    public z66(d2i d2iVar, p0n p0nVar, rws0 rws0Var, rws0 rws0Var2, String str) {
        str.getClass();
        this.f43850a = rws0Var;
        this.b = rws0Var2;
        this.c = p0nVar;
        this.d = str;
        this.e = d2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z66)) {
            return false;
        }
        z66 z66Var = (z66) obj;
        return this.f43850a.equals(z66Var.f43850a) && this.b.equals(z66Var.b) && Intrinsics.d(this.c, z66Var.c) && Intrinsics.d(this.d, z66Var.d) && Intrinsics.d(this.e, z66Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f43850a.hashCode() * 31)) * 31;
        p0n p0nVar = this.c;
        int iB = ua80.b((iHashCode + (p0nVar == null ? 0 : p0nVar.hashCode())) * 31, 31, this.d);
        f2i f2iVar = this.e;
        return iB + (f2iVar != null ? f2iVar.hashCode() : 0);
    }

    public final String toString() {
        return "MultiTeams(firstOpponentModel=" + this.f43850a + ", secondOpponentModel=" + this.b + ", timer=" + this.c + ", infoLabel=" + this.d + ", broadcastIndicatorModel=" + this.e + Separators.RPAREN;
    }
}
