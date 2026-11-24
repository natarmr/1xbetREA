package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cjg0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4460a;
    public final nig0 b;
    public final xjg0 c;
    public final List d;

    public cjg0(int i, nig0 nig0Var, xjg0 xjg0Var, List list) {
        list.getClass();
        this.f4460a = i;
        this.b = nig0Var;
        this.c = xjg0Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjg0)) {
            return false;
        }
        cjg0 cjg0Var = (cjg0) obj;
        return this.f4460a == cjg0Var.f4460a && this.b.equals(cjg0Var.b) && Intrinsics.d(this.c, cjg0Var.c) && Intrinsics.d(this.d, cjg0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.f4460a) * 31)) * 31;
        xjg0 xjg0Var = this.c;
        return this.d.hashCode() + ((iHashCode + (xjg0Var == null ? 0 : xjg0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "RpsModel(gameStatus=" + this.f4460a + ", gameInformation=" + this.b + ", animationRound=" + this.c + ", roundResult=" + this.d + Separators.RPAREN;
    }
}
