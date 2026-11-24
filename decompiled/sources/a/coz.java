package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class coz implements foz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4722a;

    public final boolean equals(Object obj) {
        if (obj instanceof coz) {
            return this.f4722a.equals(((coz) obj).f4722a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4722a.hashCode();
    }

    public final String toString() {
        return kng0.l("Previous(value=", this.f4722a, Separators.RPAREN);
    }
}
