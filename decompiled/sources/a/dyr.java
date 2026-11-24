package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dyr implements eyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fus f6908a;

    public final boolean equals(Object obj) {
        if (obj instanceof dyr) {
            return this.f6908a.equals(((dyr) obj).f6908a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6908a.hashCode();
    }

    public final String toString() {
        return axq.i("Timer(value=", this.f6908a, Separators.RPAREN);
    }
}
