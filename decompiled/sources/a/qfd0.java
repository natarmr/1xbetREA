package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qfd0 implements xfd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28627a;

    public qfd0(String str) {
        this.f28627a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qfd0) && this.f28627a.equals(((qfd0) obj).f28627a);
    }

    public final int hashCode() {
        return this.f28627a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowCodeAlreadySentError(message=", this.f28627a, Separators.RPAREN);
    }
}
