package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ahe implements die {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f871a;

    public ahe(mdm mdmVar) {
        this.f871a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahe) && this.f871a.equals(((ahe) obj).f871a);
    }

    public final int hashCode() {
        return this.f871a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(lottieConfig=", this.f871a, Separators.RPAREN);
    }
}
