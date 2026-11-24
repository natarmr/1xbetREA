package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class clh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4559a;
    public final List b;

    public clh(String str, List list) {
        list.getClass();
        this.f4559a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clh)) {
            return false;
        }
        clh clhVar = (clh) obj;
        return this.f4559a.equals(clhVar.f4559a) && Intrinsics.d(this.b, clhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4559a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CyberTournamentBracketRoundGroupModel(name=", this.f4559a, ", matches=", this.b, Separators.RPAREN);
    }
}
