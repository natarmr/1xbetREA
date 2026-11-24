package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class aoz implements foz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1225a;

    public final boolean equals(Object obj) {
        if (obj instanceof aoz) {
            return this.f1225a.equals(((aoz) obj).f1225a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1225a.hashCode();
    }

    public final String toString() {
        return kng0.l("Actual(value=", this.f1225a, Separators.RPAREN);
    }
}
