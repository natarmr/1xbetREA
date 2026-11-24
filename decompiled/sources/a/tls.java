package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34162a;
    public final String b;

    public tls(String str, String str2) {
        this.f34162a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tls)) {
            return false;
        }
        tls tlsVar = (tls) obj;
        return this.f34162a.equals(tlsVar.f34162a) && this.b.equals(tlsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34162a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("GameLogsTeamUiModel(logo=", this.f34162a, ", name=", this.b, Separators.RPAREN);
    }
}
