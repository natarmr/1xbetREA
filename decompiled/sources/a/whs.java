package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class whs implements zhs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f39180a;

    public whs(mdm mdmVar) {
        this.f39180a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof whs) && this.f39180a.equals(((whs) obj).f39180a);
    }

    public final int hashCode() {
        return this.f39180a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f39180a, Separators.RPAREN);
    }
}
