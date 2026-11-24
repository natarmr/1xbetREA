package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class nck0 implements pck0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23300a;

    public nck0(String str) {
        this.f23300a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nck0) && this.f23300a.equals(((nck0) obj).f23300a);
    }

    public final int hashCode() {
        return this.f23300a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnInputCode(code=", this.f23300a, Separators.RPAREN);
    }
}
