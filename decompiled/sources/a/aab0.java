package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class aab0 extends bab0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f517a;
    public final String b;
    public final boolean c;

    public aab0(String str, int i, boolean z) {
        this.f517a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aab0)) {
            return false;
        }
        aab0 aab0Var = (aab0) obj;
        return this.f517a == aab0Var.f517a && this.b.equals(aab0Var.b) && this.c == aab0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f517a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f517a, "OneXGames(logo=", ", name=", this.b, ", selected="), this.c, Separators.RPAREN);
    }
}
