package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29790a;
    public final c280 b;
    public final c280 c;

    public r3i(String str, c280 c280Var, c280 c280Var2) {
        str.getClass();
        this.f29790a = str;
        this.b = c280Var;
        this.c = c280Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3i)) {
            return false;
        }
        r3i r3iVar = (r3i) obj;
        return Intrinsics.d(this.f29790a, r3iVar.f29790a) && this.b.equals(r3iVar.b) && this.c.equals(r3iVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + hne.g(this.b, this.f29790a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "DSSportEventCardStatisticsTeamUiModel(name=", this.f29790a, ", logoOne=", ", logoTwo=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
