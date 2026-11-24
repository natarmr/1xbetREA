package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pzr implements qzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fus f27860a;

    public final boolean equals(Object obj) {
        if (obj instanceof pzr) {
            return this.f27860a.equals(((pzr) obj).f27860a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27860a.hashCode();
    }

    public final String toString() {
        return axq.i("Timer(value=", this.f27860a, Separators.RPAREN);
    }
}
