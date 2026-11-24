package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bc2 implements cc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2333a;

    public final boolean equals(Object obj) {
        if (obj instanceof bc2) {
            return this.f2333a.equals(((bc2) obj).f2333a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2333a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMessage(value=", this.f2333a, Separators.RPAREN);
    }
}
