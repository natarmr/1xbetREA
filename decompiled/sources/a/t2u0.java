package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class t2u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33233a;
    public final String b;
    public final String c;

    public t2u0(long j, String str, String str2) {
        this.f33233a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2u0)) {
            return false;
        }
        t2u0 t2u0Var = (t2u0) obj;
        return this.f33233a == t2u0Var.f33233a && this.b.equals(t2u0Var.b) && this.c.equals(t2u0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f33233a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f33233a, "ValueColTitleModel(id=", ", title=", this.b), ", prompt=", this.c, Separators.RPAREN);
    }
}
