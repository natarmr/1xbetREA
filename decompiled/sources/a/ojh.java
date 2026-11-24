package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ojh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25359a;
    public final String b;
    public final int c;
    public final List d;
    public final List e;
    public final List f;

    public ojh(int i, String str, String str2, List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f25359a = str;
        this.b = str2;
        this.c = i;
        this.d = list;
        this.e = list2;
        this.f = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojh)) {
            return false;
        }
        ojh ojhVar = (ojh) obj;
        return this.f25359a.equals(ojhVar.f25359a) && this.b.equals(ojhVar.b) && this.c == ojhVar.c && Intrinsics.d(this.d, ojhVar.d) && Intrinsics.d(this.e, ojhVar.e) && Intrinsics.d(this.f, ojhVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(dw9.a(twn.a(this.c, ua80.b(this.f25359a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberTournamentBracketGroupSwissModel(id=", this.f25359a, ", record=", this.b, ", index=");
        ohs0.v(this.c, ", fromGroupWinners=", ", fromGroupLosers=", sbN, this.d);
        return kng0.n(", matches=", Separators.RPAREN, sbN, this.e, this.f);
    }
}
