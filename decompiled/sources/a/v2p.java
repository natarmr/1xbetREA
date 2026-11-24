package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v2p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36697a;

    public final boolean equals(Object obj) {
        if (obj instanceof v2p) {
            return this.f36697a.equals(((v2p) obj).f36697a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36697a.hashCode();
    }

    public final String toString() {
        return kng0.l("Message(message=", this.f36697a, Separators.RPAREN);
    }
}
