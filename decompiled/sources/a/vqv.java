package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vqv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37871a;
    public final brv b;
    public final vb90 c;
    public final long d;

    public vqv(String str, brv brvVar, vb90 vb90Var, long j) {
        this.f37871a = str;
        this.b = brvVar;
        this.c = vb90Var;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqv)) {
            return false;
        }
        vqv vqvVar = (vqv) obj;
        return this.f37871a.equals(vqvVar.f37871a) && this.b.equals(vqvVar.b) && this.c.equals(vqvVar.c) && this.d == vqvVar.d;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f37871a;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f37871a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "HeaderFocusAllEventBlockUiModel(key=" + this.f37871a + ", title=" + this.b + ", gameCardUiModel=" + this.c + ", sportId=" + this.d + Separators.RPAREN;
    }
}
