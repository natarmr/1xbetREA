package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class c1s {
    public static final b1s Companion = new b1s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f3589a;
    public final String b;
    public final Double c;

    public /* synthetic */ c1s(int i, Double d, Long l, String str) {
        if ((i & 1) == 0) {
            this.f3589a = null;
        } else {
            this.f3589a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1s)) {
            return false;
        }
        c1s c1sVar = (c1s) obj;
        return Intrinsics.d(this.f3589a, c1sVar.f3589a) && Intrinsics.d(this.b, c1sVar.b) && Intrinsics.d(this.c, c1sVar.c);
    }

    public final int hashCode() {
        Long l = this.f3589a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.c;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f3589a, "GameChoice(gameId=", ", gameName=", this.b, ", currentPercentage=");
        sbS.append(this.c);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
