package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tkp0 implements wkp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f34108a;
    public final a4x b;
    public final zkp0 c;
    public final a4x d;

    public tkp0(imm immVar, a4x a4xVar, zkp0 zkp0Var, a4x a4xVar2) {
        a4xVar.getClass();
        this.f34108a = immVar;
        this.b = a4xVar;
        this.c = zkp0Var;
        this.d = a4xVar2;
    }

    @Override // a.wkp0
    public final imm a() {
        return this.f34108a;
    }

    @Override // a.wkp0
    public final a4x b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkp0)) {
            return false;
        }
        tkp0 tkp0Var = (tkp0) obj;
        return this.f34108a.equals(tkp0Var.f34108a) && Intrinsics.d(this.b, tkp0Var.b) && this.c == tkp0Var.c && this.d.equals(tkp0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cs0.b(this.b, this.f34108a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "Content(navigationBarModel=" + this.f34108a + ", championshipFilterList=" + this.b + ", teamSquadType=" + this.c + ", playerStatisticList=" + this.d + Separators.RPAREN;
    }
}
