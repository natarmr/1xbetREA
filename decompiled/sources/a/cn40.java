package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cn40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4636a;
    public final String b;
    public final boolean c;

    public cn40(String str, String str2, boolean z) {
        this.f4636a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn40)) {
            return false;
        }
        cn40 cn40Var = (cn40) obj;
        return this.f4636a.equals(cn40Var.f4636a) && this.b.equals(cn40Var.b) && this.c == cn40Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f4636a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("ModuleInfoEntry(id=", this.f4636a, ", title=", this.b, ", enabled="), this.c, Separators.RPAREN);
    }
}
