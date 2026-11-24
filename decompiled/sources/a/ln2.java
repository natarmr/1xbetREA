package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ln2 implements on2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f20324a;
    public final int b;

    public ln2(hjm hjmVar, int i) {
        this.f20324a = hjmVar;
        this.b = i;
    }

    @Override // a.on2
    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln2)) {
            return false;
        }
        ln2 ln2Var = (ln2) obj;
        return this.f20324a.equals(ln2Var.f20324a) && this.b == ln2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f20324a.hashCode() * 31);
    }

    public final String toString() {
        return "Header(headerModel=" + this.f20324a + ", spanSize=" + this.b + Separators.RPAREN;
    }
}
