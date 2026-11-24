package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class mfl0 implements pfl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f21700a;

    public mfl0(mdm mdmVar) {
        this.f21700a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mfl0) && this.f21700a.equals(((mfl0) obj).f21700a);
    }

    public final int hashCode() {
        return this.f21700a.hashCode();
    }

    public final String toString() {
        return b1j.j("EmptyViewWithTimer(lottieConfig=", this.f21700a, Separators.RPAREN);
    }
}
