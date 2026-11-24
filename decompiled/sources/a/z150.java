package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class z150 implements k250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43602a;
    public final jjm b;

    public z150(String str, jjm jjmVar) {
        this.f43602a = str;
        this.b = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z150)) {
            return false;
        }
        z150 z150Var = (z150) obj;
        return this.f43602a.equals(z150Var.f43602a) && this.b.equals(z150Var.b);
    }

    @Override // a.k250
    public final String getKey() {
        return this.f43602a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43602a.hashCode() * 31);
    }

    public final String toString() {
        return "Header(key=" + this.f43602a + ", model=" + this.b + Separators.RPAREN;
    }
}
