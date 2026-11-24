package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jv20 implements kv20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17186a;
    public final String b;
    public final boolean c;

    public jv20(String str, long j, boolean z) {
        this.f17186a = j;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv20)) {
            return false;
        }
        jv20 jv20Var = (jv20) obj;
        return this.f17186a == jv20Var.f17186a && this.b.equals(jv20Var.b) && this.c == jv20Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Long.hashCode(this.f17186a) * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(axq.o(this.f17186a, "PineClick(marketGroupId=", ", title=", this.b), ", pinned=", this.c, Separators.RPAREN);
    }
}
