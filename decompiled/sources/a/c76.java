package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c76 implements e76 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rws0 f3846a;
    public final rws0 b;
    public final p0n c;
    public final String d;
    public final f2i e;

    public c76(d2i d2iVar, p0n p0nVar, rws0 rws0Var, rws0 rws0Var2, String str) {
        str.getClass();
        this.f3846a = rws0Var;
        this.b = rws0Var2;
        this.c = p0nVar;
        this.d = str;
        this.e = d2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c76)) {
            return false;
        }
        c76 c76Var = (c76) obj;
        return this.f3846a.equals(c76Var.f3846a) && this.b.equals(c76Var.b) && Intrinsics.d(this.c, c76Var.c) && Intrinsics.d(this.d, c76Var.d) && Intrinsics.d(this.e, c76Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f3846a.hashCode() * 31)) * 31;
        p0n p0nVar = this.c;
        int iB = ua80.b((iHashCode + (p0nVar == null ? 0 : p0nVar.hashCode())) * 31, 31, this.d);
        f2i f2iVar = this.e;
        return iB + (f2iVar != null ? f2iVar.hashCode() : 0);
    }

    public final String toString() {
        return "TwoOpponents(firstOpponentModel=" + this.f3846a + ", secondOpponentModel=" + this.b + ", timer=" + this.c + ", infoLabel=" + this.d + ", broadcastIndicatorModel=" + this.e + Separators.RPAREN;
    }
}
