package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dy30 implements fy30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rpe f6875a;
    public final kpe b;

    public dy30(rpe rpeVar, kpe kpeVar) {
        this.f6875a = rpeVar;
        this.b = kpeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy30)) {
            return false;
        }
        dy30 dy30Var = (dy30) obj;
        return this.f6875a.equals(dy30Var.f6875a) && this.b.equals(dy30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f6875a.f30883a) * 31);
    }

    public final String toString() {
        return "Counter(value=" + this.f6875a + ", counterStyle=" + this.b + Separators.RPAREN;
    }
}
