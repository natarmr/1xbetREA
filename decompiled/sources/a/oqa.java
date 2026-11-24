package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class oqa extends tqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25678a;

    public oqa(String str) {
        this.f25678a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oqa) && this.f25678a.equals(((oqa) obj).f25678a);
    }

    public final int hashCode() {
        return this.f25678a.hashCode();
    }

    public final String toString() {
        return kng0.l("TemperatureInfoChanged(temperature=", this.f25678a, Separators.RPAREN);
    }
}
