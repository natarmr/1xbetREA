package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h3o0 implements i3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2n f12395a;
    public final l2n b;
    public final String c;
    public final String d;
    public final String e;

    public h3o0(l2n l2nVar, l2n l2nVar2, String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.f12395a = l2nVar;
        this.b = l2nVar2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3o0)) {
            return false;
        }
        h3o0 h3o0Var = (h3o0) obj;
        return this.f12395a.equals(h3o0Var.f12395a) && this.b.equals(h3o0Var.b) && Intrinsics.d(this.c, h3o0Var.c) && this.d.equals(h3o0Var.d) && Intrinsics.d(this.e, h3o0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b((this.b.hashCode() + (this.f12395a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WinningFormula(firstOpponent=");
        sb.append(this.f12395a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        f140.v(sb, this.c, ", gameLabel=", this.d, ", tagLiveText=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
