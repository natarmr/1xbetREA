package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mjc0 implements ojc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21891a;

    public mjc0(String str) {
        this.f21891a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mjc0) && this.f21891a.equals(((mjc0) obj).f21891a);
    }

    public final int hashCode() {
        return this.f21891a.hashCode();
    }

    public final String toString() {
        return kng0.l("Background(url=", this.f21891a, Separators.RPAREN);
    }
}
