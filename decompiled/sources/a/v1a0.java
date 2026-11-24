package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v1a0 implements w1a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wdn f36621a;

    public v1a0(wdn wdnVar) {
        this.f36621a = wdnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1a0) && this.f36621a == ((v1a0) obj).f36621a;
    }

    public final int hashCode() {
        return this.f36621a.hashCode();
    }

    public final String toString() {
        return "OnTeamChangeClick(duelTeamType=" + this.f36621a + Separators.RPAREN;
    }
}
