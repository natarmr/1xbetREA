package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class i1m implements m1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zwf f14005a;

    public i1m(zwf zwfVar) {
        this.f14005a = zwfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1m) && this.f14005a.equals(((i1m) obj).f14005a);
    }

    public final int hashCode() {
        return this.f14005a.hashCode();
    }

    public final String toString() {
        return "FilledL(filledLStyle=" + this.f14005a + Separators.RPAREN;
    }
}
