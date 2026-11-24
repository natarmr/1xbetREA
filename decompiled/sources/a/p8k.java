package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p8k implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7k f26558a;
    public final String b;
    public final boolean c;

    public p8k(p7k p7kVar, String str, boolean z) {
        this.f26558a = p7kVar;
        this.b = str;
        this.c = z;
    }

    public static p8k c(p8k p8kVar, boolean z) {
        p7k p7kVar = p8kVar.f26558a;
        String str = p8kVar.b;
        p8kVar.getClass();
        return new p8k(p7kVar, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8k)) {
            return false;
        }
        p8k p8kVar = (p8k) obj;
        return this.f26558a == p8kVar.f26558a && this.b.equals(p8kVar.b) && this.c == p8kVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f26558a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DepositLimitRSUiModel(depositLimitEnum=");
        sb.append(this.f26558a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", selected=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
