package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class v85 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36965a;
    public final String b;
    public final String c;

    public v85(long j, String str, String str2) {
        this.f36965a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v85)) {
            return false;
        }
        v85 v85Var = (v85) obj;
        return this.f36965a == v85Var.f36965a && this.b.equals(v85Var.b) && this.c.equals(v85Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f36965a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f36965a, "AvailableValueModel(value=", ", measure=", this.b), ", valueView=", this.c, Separators.RPAREN);
    }
}
