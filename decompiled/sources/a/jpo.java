package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class jpo implements kpo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16912a;

    public final boolean equals(Object obj) {
        if (obj instanceof jpo) {
            return this.f16912a.equals(((jpo) obj).f16912a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16912a.hashCode();
    }

    public final String toString() {
        return kng0.l("TitleText(value=", this.f16912a, Separators.RPAREN);
    }
}
