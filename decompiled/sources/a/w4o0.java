package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w4o0 implements d5o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rws0 f38550a;
    public final rws0 b;
    public final String c;
    public final p0n d;
    public final f2i e;

    public w4o0(d2i d2iVar, p0n p0nVar, rws0 rws0Var, rws0 rws0Var2, String str) {
        str.getClass();
        this.f38550a = rws0Var;
        this.b = rws0Var2;
        this.c = str;
        this.d = p0nVar;
        this.e = d2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4o0)) {
            return false;
        }
        w4o0 w4o0Var = (w4o0) obj;
        return this.f38550a.equals(w4o0Var.f38550a) && this.b.equals(w4o0Var.b) && Intrinsics.d(this.c, w4o0Var.c) && Intrinsics.d(this.d, w4o0Var.d) && Intrinsics.d(this.e, w4o0Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b((this.b.hashCode() + (this.f38550a.hashCode() * 31)) * 31, 31, this.c);
        p0n p0nVar = this.d;
        int iHashCode = (iB + (p0nVar == null ? 0 : p0nVar.hashCode())) * 31;
        f2i f2iVar = this.e;
        return iHashCode + (f2iVar != null ? f2iVar.hashCode() : 0);
    }

    public final String toString() {
        return "CardGame(firstOpponentModel=" + this.f38550a + ", secondOpponentModel=" + this.b + ", infoLabel=" + this.c + ", timer=" + this.d + ", broadcastIndicatorModel=" + this.e + Separators.RPAREN;
    }
}
