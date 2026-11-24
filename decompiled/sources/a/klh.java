package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class klh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18487a;
    public final int b;
    public final List c;

    public klh(String str, List list, int i) {
        str.getClass();
        list.getClass();
        this.f18487a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klh)) {
            return false;
        }
        klh klhVar = (klh) obj;
        return Intrinsics.d(this.f18487a, klhVar.f18487a) && this.b == klhVar.b && Intrinsics.d(this.c, klhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f18487a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(kng0.p(this.b, "CyberTournamentBracketRoundSwissModel(name=", this.f18487a, ", index=", ", groups="), this.c, Separators.RPAREN);
    }
}
