package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rqa extends tqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30922a;

    public rqa(String str) {
        this.f30922a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqa) && this.f30922a.equals(((rqa) obj).f30922a);
    }

    public final int hashCode() {
        return this.f30922a.hashCode();
    }

    public final String toString() {
        return kng0.l("WindSpeedInfoChanged(windSpeed=", this.f30922a, Separators.RPAREN);
    }
}
