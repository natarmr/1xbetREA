package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class u2u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34964a;
    public final String b;
    public final prq0 c;
    public final String d;

    public u2u0(long j, String str, prq0 prq0Var, String str2) {
        this.f34964a = j;
        this.b = str;
        this.c = prq0Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2u0)) {
            return false;
        }
        u2u0 u2u0Var = (u2u0) obj;
        return this.f34964a == u2u0Var.f34964a && this.b.equals(u2u0Var.b) && this.c == u2u0Var.c && this.d.equals(u2u0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b(Long.hashCode(this.f34964a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f34964a, "ValueColTitleModel(id=", ", title=", this.b);
        sbO.append(", titleIconType=");
        sbO.append(this.c);
        sbO.append(", prompt=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
