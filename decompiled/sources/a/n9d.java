package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class n9d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23133a;
    public final String b;
    public final int c;

    public n9d(int i, String str, String str2) {
        this.f23133a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9d)) {
            return false;
        }
        n9d n9dVar = (n9d) obj;
        return this.f23133a.equals(n9dVar.f23133a) && this.b.equals(n9dVar.b) && this.c == n9dVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f23133a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("CommonItemModel(name=", this.f23133a, ", image=", this.b, ", timeSeconds="));
    }
}
