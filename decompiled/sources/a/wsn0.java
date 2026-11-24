package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wsn0 implements atn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39701a;

    public final boolean equals(Object obj) {
        if (obj instanceof wsn0) {
            return this.f39701a.equals(((wsn0) obj).f39701a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39701a.hashCode();
    }

    public final String toString() {
        return kng0.l("InfoText(value=", this.f39701a, Separators.RPAREN);
    }
}
