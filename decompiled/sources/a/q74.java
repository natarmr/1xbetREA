package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class q74 implements s74 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f28231a;

    public q74(mdm mdmVar) {
        this.f28231a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q74) && this.f28231a.equals(((q74) obj).f28231a);
    }

    public final int hashCode() {
        return this.f28231a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f28231a, Separators.RPAREN);
    }
}
