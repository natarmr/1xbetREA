package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yeh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42486a;
    public final String b;
    public final String c;

    public yeh0(long j, String str, String str2) {
        this.f42486a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yeh0)) {
            return false;
        }
        yeh0 yeh0Var = (yeh0) obj;
        return this.f42486a == yeh0Var.f42486a && this.b.equals(yeh0Var.b) && this.c.equals(yeh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f42486a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f42486a, "SearchCategory(id=", ", name=", this.b), ", imageId=", this.c, Separators.RPAREN);
    }
}
