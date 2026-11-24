package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class xie implements ije {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f40940a;

    public xie(mdm mdmVar) {
        this.f40940a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xie) && this.f40940a.equals(((xie) obj).f40940a);
    }

    public final int hashCode() {
        return this.f40940a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f40940a, Separators.RPAREN);
    }
}
