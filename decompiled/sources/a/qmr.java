package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qmr implements umr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dja f28998a;

    public final boolean equals(Object obj) {
        if (obj instanceof qmr) {
            return this.f28998a == ((qmr) obj).f28998a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28998a.hashCode();
    }

    public final String toString() {
        return "PlaceholderPlayClick(type=" + this.f28998a + Separators.RPAREN;
    }
}
