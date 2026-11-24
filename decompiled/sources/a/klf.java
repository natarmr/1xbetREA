package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class klf extends slf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18483a;

    public klf(String str) {
        this.f18483a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof klf) && this.f18483a.equals(((klf) obj).f18483a);
    }

    public final int hashCode() {
        return this.f18483a.hashCode();
    }

    public final String toString() {
        return kng0.l("Cs2BombDefusedGameLogModel(player=", this.f18483a, Separators.RPAREN);
    }
}
