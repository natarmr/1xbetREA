package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class a2m0 implements e2m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8b f131a;

    public a2m0(y8b y8bVar) {
        this.f131a = y8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2m0) && this.f131a.equals(((a2m0) obj).f131a);
    }

    public final int hashCode() {
        return this.f131a.hashCode();
    }

    public final String toString() {
        return "OnTeamClicked(item=" + this.f131a + Separators.RPAREN;
    }
}
