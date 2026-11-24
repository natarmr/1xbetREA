package a;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fs80 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10054a;
    public final long b;
    public final List c;
    public final List d;
    public final long e;
    public final boolean f;

    public fs80(String str, long j, List list, List list2, long j2, boolean z, int i) {
        str = (i & 1) != 0 ? "" : str;
        j = (i & 2) != 0 ? nw80.t.getId() : j;
        list = (i & 4) != 0 ? iun.f15405a : list;
        list2 = (i & 8) != 0 ? iun.f15405a : list2;
        j2 = (i & 16) != 0 ? Long.MIN_VALUE : j2;
        z = (i & 32) != 0 ? true : z;
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f10054a = str;
        this.b = j;
        this.c = list;
        this.d = list2;
        this.e = j2;
        this.f = z;
    }

    public final boolean a() {
        return this.b == nw80.t.getId() && this.c.isEmpty() && this.e == Long.MIN_VALUE && this.d.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs80)) {
            return false;
        }
        fs80 fs80Var = (fs80) obj;
        return this.f10054a.equals(fs80Var.f10054a) && this.b == fs80Var.b && this.c.equals(fs80Var.c) && this.d.equals(fs80Var.d) && this.e == fs80Var.e && this.f == fs80Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(rw2.b(dw9.a(dw9.a(rw2.b(this.f10054a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "PartTypeOneModel(title=", this.f10054a, ", partitionId=");
        hne.v(", filterIds=", ", providersList=", sbO, this.c, this.d);
        kng0.A(sbO, ", gameId=", this.e, ", showNavBar=");
        return rw2.p(sbO, this.f, ", fromSuccessfulSearch=false)");
    }
}
