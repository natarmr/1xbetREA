package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class d0m implements f0m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rpe f5274a;
    public final hpe b;

    public d0m(rpe rpeVar, hpe hpeVar) {
        this.f5274a = rpeVar;
        this.b = hpeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0m)) {
            return false;
        }
        d0m d0mVar = (d0m) obj;
        return this.f5274a.equals(d0mVar.f5274a) && this.b.equals(d0mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f5274a.f30883a) * 31);
    }

    public final String toString() {
        return "Counter(value=" + this.f5274a + ", counterStyle=" + this.b + Separators.RPAREN;
    }
}
