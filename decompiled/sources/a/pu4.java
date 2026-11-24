package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pu4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bjk f27596a;

    public pu4(bjk bjkVar) {
        this.f27596a = bjkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu4) && this.f27596a.equals(((pu4) obj).f27596a);
    }

    public final int hashCode() {
        return this.f27596a.hashCode();
    }

    public final String toString() {
        return "AuthorizationContext(authDialogParams=" + this.f27596a + Separators.RPAREN;
    }
}
