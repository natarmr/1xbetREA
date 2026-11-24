package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mkm implements nkm {
    public mkm() {
        xuz xuzVar = pb10.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkm)) {
            return false;
        }
        xuz xuzVar = pb10.c;
        return true;
    }

    public final int hashCode() {
        return pb10.g.hashCode();
    }

    public final String toString() {
        return "NoInternet(lottie=" + pb10.g + Separators.RPAREN;
    }
}
