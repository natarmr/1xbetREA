package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class twr implements uwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fus f34665a;

    public final boolean equals(Object obj) {
        if (obj instanceof twr) {
            return this.f34665a.equals(((twr) obj).f34665a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34665a.hashCode();
    }

    public final String toString() {
        return axq.i("Timer(value=", this.f34665a, Separators.RPAREN);
    }
}
