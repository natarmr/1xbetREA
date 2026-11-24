package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ia8 implements qa8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14425a;

    public final boolean equals(Object obj) {
        if (obj instanceof ia8) {
            return this.f14425a.equals(((ia8) obj).f14425a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14425a.hashCode();
    }

    public final String toString() {
        return kng0.l("BlockBetErrorText(value=", this.f14425a, Separators.RPAREN);
    }
}
