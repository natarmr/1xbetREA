package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bhg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugd f2605a;

    public bhg0(ugd ugdVar) {
        this.f2605a = ugdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhg0) && this.f2605a == ((bhg0) obj).f2605a;
    }

    public final int hashCode() {
        return this.f2605a.hashCode();
    }

    public final String toString() {
        return "RouteRunnerContainer(routeRunner=" + this.f2605a + Separators.RPAREN;
    }
}
