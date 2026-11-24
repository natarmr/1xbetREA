package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class oq20 implements pq20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25668a;

    public final boolean equals(Object obj) {
        if (obj instanceof oq20) {
            return this.f25668a.equals(((oq20) obj).f25668a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25668a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamName(value=", this.f25668a, Separators.RPAREN);
    }
}
