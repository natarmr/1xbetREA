package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qwr implements uwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29447a;

    public final boolean equals(Object obj) {
        if (obj instanceof qwr) {
            return this.f29447a.equals(((qwr) obj).f29447a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29447a.hashCode();
    }

    public final String toString() {
        return kng0.l("Information(value=", this.f29447a, Separators.RPAREN);
    }
}
