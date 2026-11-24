package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kqa extends tqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18712a;

    public kqa(String str) {
        this.f18712a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kqa) && this.f18712a.equals(((kqa) obj).f18712a);
    }

    public final int hashCode() {
        return this.f18712a.hashCode();
    }

    public final String toString() {
        return kng0.l("HumidityInfoChanged(humidity=", this.f18712a, Separators.RPAREN);
    }
}
