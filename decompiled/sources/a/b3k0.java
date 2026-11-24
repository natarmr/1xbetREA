package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class b3k0 implements g3k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1911a;
    public final hjm b;

    public b3k0(hjm hjmVar, String str) {
        this.f1911a = str;
        this.b = hjmVar;
    }

    @Override // a.g3k0
    public final String a() {
        return this.f1911a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3k0)) {
            return false;
        }
        b3k0 b3k0Var = (b3k0) obj;
        return this.f1911a.equals(b3k0Var.f1911a) && this.b.equals(b3k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1911a.hashCode() * 31);
    }

    public final String toString() {
        return "DateHeader(itemKey=" + this.f1911a + ", dsHeaderModel=" + this.b + Separators.RPAREN;
    }
}
