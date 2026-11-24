package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p4o0 implements v4o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ovm f26364a;
    public final ovm b;
    public final z1m c;
    public final String d;
    public final a4x e;

    public p4o0(ovm ovmVar, ovm ovmVar2, z1m z1mVar, String str, a4x a4xVar) {
        a4xVar.getClass();
        this.f26364a = ovmVar;
        this.b = ovmVar2;
        this.c = z1mVar;
        this.d = str;
        this.e = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4o0)) {
            return false;
        }
        p4o0 p4o0Var = (p4o0) obj;
        return this.f26364a.equals(p4o0Var.f26364a) && this.b.equals(p4o0Var.b) && this.c.equals(p4o0Var.c) && this.d.equals(p4o0Var.d) && Intrinsics.d(this.e, p4o0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(rz4.b(this.c.f43628a, (this.b.hashCode() + (this.f26364a.hashCode() * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberPoker(firstOpponent=");
        sb.append(this.f26364a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", gameLabel=");
        sb.append(this.d);
        sb.append(", cardOnTableList=");
        return cs0.n(sb, this.e, Separators.RPAREN);
    }
}
