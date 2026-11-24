package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class a32 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f151a;
    public final z22 b;
    public final String c;

    public a32(hjm hjmVar, z22 z22Var) {
        this.f151a = hjmVar;
        this.b = z22Var;
        this.c = String.valueOf(hjmVar.f13167a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a32)) {
            return false;
        }
        a32 a32Var = (a32) obj;
        return this.f151a.equals(a32Var.f151a) && this.b == a32Var.b;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f151a.hashCode() * 31);
    }

    public final String toString() {
        return "AllEventGamesHeaderUiModel(header=" + this.f151a + ", type=" + this.b + Separators.RPAREN;
    }
}
