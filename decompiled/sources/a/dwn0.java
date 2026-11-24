package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dwn0 implements fwn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6808a;

    public final boolean equals(Object obj) {
        if (obj instanceof dwn0) {
            return this.f6808a.equals(((dwn0) obj).f6808a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6808a.hashCode();
    }

    public final String toString() {
        return kng0.l("Score(value=", this.f6808a, Separators.RPAREN);
    }
}
