package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class oib implements pib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd50 f25302a;

    public oib(fd50 fd50Var) {
        this.f25302a = fd50Var;
    }

    @Override // a.pib
    public final fd50 a() {
        return this.f25302a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oib) && this.f25302a.equals(((oib) obj).f25302a);
    }

    public final int hashCode() {
        return this.f25302a.f9343a.hashCode();
    }

    public final String toString() {
        return "Loading(navigationBarUiState=" + this.f25302a + Separators.RPAREN;
    }
}
