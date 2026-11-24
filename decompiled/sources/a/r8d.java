package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class r8d implements u8d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wyc f30019a;

    public final boolean equals(Object obj) {
        if (obj instanceof r8d) {
            return this.f30019a.equals(((r8d) obj).f30019a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30019a.hashCode();
    }

    public final String toString() {
        return "BetUiModel(value=" + this.f30019a + Separators.RPAREN;
    }
}
