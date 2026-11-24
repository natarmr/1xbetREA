package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class a58 implements c58 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f257a;

    public a58(mdm mdmVar) {
        this.f257a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a58) && this.f257a.equals(((a58) obj).f257a);
    }

    public final int hashCode() {
        return this.f257a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorLottie=", this.f257a, Separators.RPAREN);
    }
}
