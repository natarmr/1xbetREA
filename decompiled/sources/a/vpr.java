package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vpr implements wpr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37819a;

    public final boolean equals(Object obj) {
        if (obj instanceof vpr) {
            return this.f37819a == ((vpr) obj).f37819a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37819a);
    }

    public final String toString() {
        return defpackage.c.d("OnSimulationClick(toSimulation=", Separators.RPAREN, this.f37819a);
    }
}
