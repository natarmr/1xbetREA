package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s28 implements u28 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31491a;

    public s28(String str) {
        this.f31491a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s28) && this.f31491a.equals(((s28) obj).f31491a);
    }

    public final int hashCode() {
        return this.f31491a.hashCode();
    }

    public final String toString() {
        return kng0.l("InitEmail(email=", this.f31491a, Separators.RPAREN);
    }
}
