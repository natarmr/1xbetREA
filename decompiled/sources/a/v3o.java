package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v3o implements x3o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f36738a;

    public v3o(sjd sjdVar) {
        this.f36738a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3o) && this.f36738a.equals(((v3o) obj).f36738a);
    }

    public final int hashCode() {
        return this.f36738a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendGameCardSideEffect(internalEffect=", this.f36738a, Separators.RPAREN);
    }
}
