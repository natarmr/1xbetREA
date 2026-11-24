package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wnj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t270 f39451a;

    public wnj(t270 t270Var) {
        this.f39451a = t270Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wnj) && this.f39451a == ((wnj) obj).f39451a;
    }

    public final int hashCode() {
        return this.f39451a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return "OneXGamesTabsType(hasBackStack=false, screenType=" + this.f39451a + Separators.RPAREN;
    }
}
