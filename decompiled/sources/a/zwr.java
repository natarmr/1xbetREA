package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zwr implements ixr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ywr f45121a;

    public final boolean equals(Object obj) {
        if (obj instanceof zwr) {
            return this.f45121a.equals(((zwr) obj).f45121a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45121a.hashCode();
    }

    public final String toString() {
        return "FifthValue(statistic=" + this.f45121a + Separators.RPAREN;
    }
}
