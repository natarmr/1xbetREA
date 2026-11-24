package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class oi5 implements pi5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25295a;

    public oi5(String str) {
        this.f25295a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oi5) && this.f25295a.equals(((oi5) obj).f25295a);
    }

    public final int hashCode() {
        return this.f25295a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorMessage(errorMessage=", this.f25295a, Separators.RPAREN);
    }
}
