package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j2o0 implements k2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2n f15791a;
    public final i2n b;
    public final kpm c;
    public final String d;
    public final String e;

    public j2o0(i2n i2nVar, i2n i2nVar2, kpm kpmVar, String str, String str2) {
        str.getClass();
        this.f15791a = i2nVar;
        this.b = i2nVar2;
        this.c = kpmVar;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2o0)) {
            return false;
        }
        j2o0 j2o0Var = (j2o0) obj;
        return this.f15791a.equals(j2o0Var.f15791a) && this.b.equals(j2o0Var.b) && this.c.equals(j2o0Var.c) && Intrinsics.d(this.d, j2o0Var.d) && this.e.equals(j2o0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(dw9.c(this.c, (this.b.hashCode() + (this.f15791a.hashCode() * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WinningFormula(firstOpponent=");
        sb.append(this.f15791a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", infoLabel=");
        sb.append(this.d);
        sb.append(", gameLabel=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
