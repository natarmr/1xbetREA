package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class flh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final alh0 f9738a;

    public flh0(alh0 alh0Var) {
        this.f9738a = alh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof flh0) && this.f9738a.equals(((flh0) obj).f9738a);
    }

    public final int hashCode() {
        return this.f9738a.hashCode();
    }

    public final String toString() {
        return "SecretQuestionChoiceUiState(model=" + this.f9738a + Separators.RPAREN;
    }
}
