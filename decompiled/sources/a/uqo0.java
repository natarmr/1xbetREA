package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uqo0 implements vqo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f36129a;

    public uqo0(d4d d4dVar) {
        this.f36129a = d4dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uqo0) && this.f36129a == ((uqo0) obj).f36129a;
    }

    public final int hashCode() {
        return this.f36129a.hashCode();
    }

    public final String toString() {
        return "Rounded(borderColorKey=" + this.f36129a + Separators.RPAREN;
    }
}
