package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class mke0 implements oke0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f21940a;

    public mke0(mdm mdmVar) {
        this.f21940a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mke0) && this.f21940a.equals(((mke0) obj).f21940a);
    }

    public final int hashCode() {
        return this.f21940a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f21940a, Separators.RPAREN);
    }
}
