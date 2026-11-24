package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mih implements sih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21846a;
    public final String b;

    public mih(String str, String str2) {
        this.f21846a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mih)) {
            return false;
        }
        mih mihVar = (mih) obj;
        return this.f21846a.equals(mihVar.f21846a) && this.b.equals(mihVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21846a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("OnPlayoffTeamClick(matchId=", this.f21846a, ", teamName=", this.b, Separators.RPAREN);
    }
}
