package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class awr implements ewr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1588a;

    public final boolean equals(Object obj) {
        if (obj instanceof awr) {
            return this.f1588a.equals(((awr) obj).f1588a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1588a.hashCode();
    }

    public final String toString() {
        return kng0.l("Information(value=", this.f1588a, Separators.RPAREN);
    }
}
