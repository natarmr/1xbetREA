package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z56 implements g66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pws0 f43801a;
    public final pws0 b;
    public final lpm c;
    public final p0n d;
    public final String e;

    public z56(pws0 pws0Var, pws0 pws0Var2, lpm lpmVar, p0n p0nVar, String str) {
        str.getClass();
        this.f43801a = pws0Var;
        this.b = pws0Var2;
        this.c = lpmVar;
        this.d = p0nVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z56)) {
            return false;
        }
        z56 z56Var = (z56) obj;
        return this.f43801a.equals(z56Var.f43801a) && this.b.equals(z56Var.b) && this.c.equals(z56Var.c) && Intrinsics.d(this.d, z56Var.d) && Intrinsics.d(this.e, z56Var.e);
    }

    public final int hashCode() {
        int iE = f140.e(this.c, (this.b.hashCode() + (this.f43801a.hashCode() * 31)) * 31, 31);
        p0n p0nVar = this.d;
        return this.e.hashCode() + ((iE + (p0nVar == null ? 0 : p0nVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cricket(firstOpponentModel=");
        sb.append(this.f43801a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", score=");
        sb.append(this.c);
        sb.append(", timer=");
        sb.append(this.d);
        sb.append(", infoLabel=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
