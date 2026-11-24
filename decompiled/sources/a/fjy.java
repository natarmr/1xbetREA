package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fjy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9666a;
    public final List b;

    public fjy(String str, List list) {
        list.getClass();
        this.f9666a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjy)) {
            return false;
        }
        fjy fjyVar = (fjy) obj;
        return this.f9666a.equals(fjyVar.f9666a) && Intrinsics.d(this.b, fjyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9666a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("KabaddiTeamsWithPlayersModel(teamId=", this.f9666a, ", players=", this.b, Separators.RPAREN);
    }
}
