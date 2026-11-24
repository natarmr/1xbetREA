package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class eh50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7793a;
    public final String b;
    public final long c;
    public final List d;

    public eh50(long j, String str, String str2, List list) {
        list.getClass();
        this.f7793a = str;
        this.b = str2;
        this.c = j;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh50)) {
            return false;
        }
        eh50 eh50Var = (eh50) obj;
        return this.f7793a.equals(eh50Var.f7793a) && this.b.equals(eh50Var.b) && this.c == eh50Var.c && Intrinsics.d(this.d, eh50Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b(ua80.b(this.f7793a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("NearestGameDetailsOpponentModel(fullNameEng=", this.f7793a, ", fullName=", this.b, ", countryId=");
        hne.x(sbN, this.c, ", opps=", this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
