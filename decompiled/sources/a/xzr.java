package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xzr implements yzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fus f41767a;

    public final boolean equals(Object obj) {
        if (obj instanceof xzr) {
            return this.f41767a.equals(((xzr) obj).f41767a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41767a.hashCode();
    }

    public final String toString() {
        return axq.i("Timer(value=", this.f41767a, Separators.RPAREN);
    }
}
