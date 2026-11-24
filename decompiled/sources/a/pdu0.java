package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pdu0 implements wdu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26823a;

    public final boolean equals(Object obj) {
        if (obj instanceof pdu0) {
            return this.f26823a.equals(((pdu0) obj).f26823a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26823a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondPlayerFirstNumber(value=", this.f26823a, Separators.RPAREN);
    }
}
