package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ii4 implements ni4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14811a;

    public final boolean equals(Object obj) {
        if (obj instanceof ii4) {
            return this.f14811a.equals(((ii4) obj).f14811a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14811a.hashCode();
    }

    public final String toString() {
        return "OnLoginValueChanged(value=" + ((Object) this.f14811a) + Separators.RPAREN;
    }
}
