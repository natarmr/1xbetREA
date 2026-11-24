package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yw20 implements cx20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43350a;

    public final boolean equals(Object obj) {
        if (obj instanceof yw20) {
            return this.f43350a.equals(((yw20) obj).f43350a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43350a.hashCode();
    }

    public final String toString() {
        return kng0.l("CoefText(value=", this.f43350a, Separators.RPAREN);
    }
}
