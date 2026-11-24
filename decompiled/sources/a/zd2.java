package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zd2 implements be2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f44192a;

    public zd2(sjd sjdVar) {
        this.f44192a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zd2) && this.f44192a.equals(((zd2) obj).f44192a);
    }

    public final int hashCode() {
        return this.f44192a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendGameCardSideEffect(internalEffect=", this.f44192a, Separators.RPAREN);
    }
}
