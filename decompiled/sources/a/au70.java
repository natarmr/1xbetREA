package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class au70 implements cu70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1464a;

    public final boolean equals(Object obj) {
        if (obj instanceof au70) {
            return this.f1464a.equals(((au70) obj).f1464a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1464a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowOperatorRatingDialog(callId=", this.f1464a, Separators.RPAREN);
    }
}
