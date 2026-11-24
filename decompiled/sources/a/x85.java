package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x85 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40447a;
    public final String b;
    public final String c;

    public x85(long j, String str, String str2) {
        this.f40447a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x85)) {
            return false;
        }
        x85 x85Var = (x85) obj;
        return this.f40447a == x85Var.f40447a && this.b.equals(x85Var.b) && this.c.equals(x85Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f40447a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f40447a, "AvailableValueModel(value=", ", measure=", this.b), ", valueView=", this.c, Separators.RPAREN);
    }
}
