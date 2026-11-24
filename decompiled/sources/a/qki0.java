package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qki0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nki0 f28887a;
    public final String b;
    public final boolean c;

    public qki0(nki0 nki0Var, String str, boolean z) {
        this.f28887a = nki0Var;
        this.b = str;
        this.c = z;
    }

    public static qki0 c(qki0 qki0Var, boolean z) {
        nki0 nki0Var = qki0Var.f28887a;
        String str = qki0Var.b;
        qki0Var.getClass();
        return new qki0(nki0Var, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qki0)) {
            return false;
        }
        qki0 qki0Var = (qki0) obj;
        return this.f28887a == qki0Var.f28887a && this.b.equals(qki0Var.b) && this.c == qki0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f28887a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionTimeLimitUiModel(sessionTimeLimitEnum=");
        sb.append(this.f28887a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", selected=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
