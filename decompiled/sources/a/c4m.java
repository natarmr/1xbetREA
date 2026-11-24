package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c4m implements e4m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f3732a;
    public final String b;
    public final z3m c;

    public c4m(n0x n0xVar, String str, z3m z3mVar) {
        this.f3732a = n0xVar;
        this.b = str;
        this.c = z3mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4m)) {
            return false;
        }
        c4m c4mVar = (c4m) obj;
        return this.f3732a.equals(c4mVar.f3732a) && this.b.equals(c4mVar.b) && this.c == c4mVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f3732a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "IconWithTitle(icon=" + this.f3732a + ", title=" + this.b + ", iconType=" + this.c + Separators.RPAREN;
    }
}
