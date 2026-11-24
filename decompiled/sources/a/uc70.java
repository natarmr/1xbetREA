package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uc70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tc70 f35416a;
    public final sc70 b;
    public final rc70 c;

    public uc70(tc70 tc70Var, sc70 sc70Var, rc70 rc70Var) {
        this.f35416a = tc70Var;
        this.b = sc70Var;
        this.c = rc70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc70)) {
            return false;
        }
        uc70 uc70Var = (uc70) obj;
        return this.f35416a.equals(uc70Var.f35416a) && this.b.equals(uc70Var.b) && this.c.equals(uc70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f35416a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OneXGamesWebGameUnauthorizedDemoUiState(top=" + this.f35416a + ", middle=" + this.b + ", bottom=" + this.c + Separators.RPAREN;
    }
}
