package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class etn0 implements gtn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8384a;

    public final boolean equals(Object obj) {
        if (obj instanceof etn0) {
            return this.f8384a.equals(((etn0) obj).f8384a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8384a.hashCode();
    }

    public final String toString() {
        return kng0.l("PossibleWin(value=", this.f8384a, Separators.RPAREN);
    }
}
