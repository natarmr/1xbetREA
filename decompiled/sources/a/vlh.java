package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vlh extends xlh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37623a;
    public final List b;

    public vlh(String str, List list) {
        list.getClass();
        this.f37623a = str;
        this.b = list;
    }

    @Override // a.xlh
    public final String a() {
        return this.f37623a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlh)) {
            return false;
        }
        vlh vlhVar = (vlh) obj;
        return this.f37623a.equals(vlhVar.f37623a) && Intrinsics.d(this.b, vlhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37623a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CyberTournamentBracketStagePlayoffModel(name=", this.f37623a, ", brackets=", this.b, Separators.RPAREN);
    }
}
