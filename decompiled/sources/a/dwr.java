package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dwr implements ewr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fus f6812a;

    public final boolean equals(Object obj) {
        if (obj instanceof dwr) {
            return this.f6812a.equals(((dwr) obj).f6812a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6812a.hashCode();
    }

    public final String toString() {
        return axq.i("Timer(value=", this.f6812a, Separators.RPAREN);
    }
}
