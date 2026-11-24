package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r2o0 implements s2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2n f29746a;
    public final n2n b;
    public final y1m c;
    public final String d;
    public final String e;
    public final String f;

    public r2o0(n2n n2nVar, n2n n2nVar2, y1m y1mVar, String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f29746a = n2nVar;
        this.b = n2nVar2;
        this.c = y1mVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2o0)) {
            return false;
        }
        r2o0 r2o0Var = (r2o0) obj;
        return this.f29746a.equals(r2o0Var.f29746a) && this.b.equals(r2o0Var.b) && this.c.equals(r2o0Var.c) && Intrinsics.d(this.d, r2o0Var.d) && Intrinsics.d(this.e, r2o0Var.e) && Intrinsics.d(this.f, r2o0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f29746a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WinningFormula(firstOpponent=");
        sb.append(this.f29746a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", gameLabel=");
        sb.append(this.d);
        sb.append(", infoLabel=");
        return ua80.m(sb, this.e, ", tagLive=", this.f, Separators.RPAREN);
    }
}
