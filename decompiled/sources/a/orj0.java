package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class orj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final prj0 f25736a;

    public orj0(prj0 prj0Var) {
        this.f25736a = prj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof orj0) && this.f25736a.equals(((orj0) obj).f25736a);
    }

    public final int hashCode() {
        return this.f25736a.hashCode();
    }

    public final String toString() {
        return "StateChanged(shortInfoUiItem=" + this.f25736a + Separators.RPAREN;
    }
}
