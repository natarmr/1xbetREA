package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class h2a0 implements n2a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wdn f12321a;

    public h2a0(wdn wdnVar) {
        this.f12321a = wdnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2a0) && this.f12321a == ((h2a0) obj).f12321a;
    }

    public final int hashCode() {
        return this.f12321a.hashCode();
    }

    public final String toString() {
        return "ShowDuelBuilderDialog(duelTeamType=" + this.f12321a + Separators.RPAREN;
    }
}
