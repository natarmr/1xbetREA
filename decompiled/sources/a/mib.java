package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mib implements pib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd50 f21836a;

    public mib(fd50 fd50Var) {
        this.f21836a = fd50Var;
    }

    @Override // a.pib
    public final fd50 a() {
        return this.f21836a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mib) && this.f21836a.equals(((mib) obj).f21836a);
    }

    public final int hashCode() {
        return this.f21836a.f9343a.hashCode();
    }

    public final String toString() {
        return "Content(navigationBarUiState=" + this.f21836a + Separators.RPAREN;
    }
}
