package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o8k implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8k f24833a;
    public final String b;
    public final boolean c;

    public o8k(n8k n8kVar, String str, boolean z) {
        this.f24833a = n8kVar;
        this.b = str;
        this.c = z;
    }

    public static o8k c(o8k o8kVar, boolean z) {
        n8k n8kVar = o8kVar.f24833a;
        String str = o8kVar.b;
        o8kVar.getClass();
        return new o8k(n8kVar, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8k)) {
            return false;
        }
        o8k o8kVar = (o8k) obj;
        return this.f24833a == o8kVar.f24833a && this.b.equals(o8kVar.b) && this.c == o8kVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f24833a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DepositLimitKzUiModel(depositLimitEnum=");
        sb.append(this.f24833a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", selected=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
