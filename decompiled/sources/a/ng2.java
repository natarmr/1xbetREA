package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ng2 implements tg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f23464a;

    public ng2(sjd sjdVar) {
        this.f23464a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng2) && this.f23464a.equals(((ng2) obj).f23464a);
    }

    public final int hashCode() {
        return this.f23464a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeSendGameCardSideEffect(internalEffect=", this.f23464a, Separators.RPAREN);
    }
}
