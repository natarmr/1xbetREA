package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wwl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39890a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public wwl0(String str, String str2, String str3, String str4, long j) {
        this.f39890a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwl0)) {
            return false;
        }
        wwl0 wwl0Var = (wwl0) obj;
        return this.f39890a == wwl0Var.f39890a && this.b.equals(wwl0Var.b) && this.c.equals(wwl0Var.c) && this.d.equals(wwl0Var.d) && this.e.equals(wwl0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(Long.hashCode(this.f39890a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f39890a, "StadiumModel(id=", ", title=", this.b);
        f140.v(sbO, ", capacity=", this.c, ", opened=", this.d);
        return rw2.o(sbO, ", architect=", this.e, Separators.RPAREN);
    }
}
