package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yyr implements zyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fus f43481a;

    public final boolean equals(Object obj) {
        if (obj instanceof yyr) {
            return this.f43481a.equals(((yyr) obj).f43481a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43481a.hashCode();
    }

    public final String toString() {
        return axq.i("Timer(value=", this.f43481a, Separators.RPAREN);
    }
}
