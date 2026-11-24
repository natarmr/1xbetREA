package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nib implements pib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd50 f23576a;
    public final mdm b;

    public nib(fd50 fd50Var, mdm mdmVar) {
        this.f23576a = fd50Var;
        this.b = mdmVar;
    }

    @Override // a.pib
    public final fd50 a() {
        return this.f23576a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nib)) {
            return false;
        }
        nib nibVar = (nib) obj;
        return this.f23576a.equals(nibVar.f23576a) && this.b.equals(nibVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23576a.f9343a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(navigationBarUiState=" + this.f23576a + ", config=" + this.b + Separators.RPAREN;
    }
}
