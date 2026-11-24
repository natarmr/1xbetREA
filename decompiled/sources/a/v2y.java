package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v2y extends y2y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2y f36709a;

    public v2y(u2y u2yVar) {
        this.f36709a = u2yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2y) && this.f36709a.equals(((v2y) obj).f36709a);
    }

    public final int hashCode() {
        return this.f36709a.hashCode();
    }

    public final String toString() {
        return "Content(jackpotInfoModel=" + this.f36709a + Separators.RPAREN;
    }
}
