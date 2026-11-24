package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cle0 implements fle0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f4554a;

    public cle0(mdm mdmVar) {
        this.f4554a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cle0) && this.f4554a.equals(((cle0) obj).f4554a);
    }

    public final int hashCode() {
        return this.f4554a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(emptyLottie=", this.f4554a, Separators.RPAREN);
    }
}
