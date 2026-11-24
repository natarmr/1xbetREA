package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qxh implements sxh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f29485a;

    public qxh(mdm mdmVar) {
        this.f29485a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxh) && this.f29485a.equals(((qxh) obj).f29485a);
    }

    public final int hashCode() {
        return this.f29485a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f29485a, Separators.RPAREN);
    }
}
