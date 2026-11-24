package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rhf implements yhf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kff f30487a;

    public final boolean equals(Object obj) {
        if (obj instanceof rhf) {
            return this.f30487a.equals(((rhf) obj).f30487a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30487a.hashCode();
    }

    public final String toString() {
        return "GameState(value=" + this.f30487a + Separators.RPAREN;
    }
}
