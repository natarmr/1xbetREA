package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class v1o implements x1o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f36643a;

    public v1o(jkm jkmVar) {
        this.f36643a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1o) && this.f36643a.equals(((v1o) obj).f36643a);
    }

    public final int hashCode() {
        return this.f36643a.hashCode();
    }

    public final String toString() {
        return twn.o("NetworkDataError(lottieConfig=", this.f36643a, Separators.RPAREN);
    }
}
