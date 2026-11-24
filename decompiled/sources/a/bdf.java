package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class bdf {
    public static final adf Companion = new adf();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new x5f(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2397a;
    public final List b;

    public /* synthetic */ bdf(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f2397a = null;
        } else {
            this.f2397a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdf)) {
            return false;
        }
        bdf bdfVar = (bdf) obj;
        return Intrinsics.d(this.f2397a, bdfVar.f2397a) && Intrinsics.d(this.b, bdfVar.b);
    }

    public final int hashCode() {
        String str = this.f2397a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("CricketBallsResponse(players=", this.f2397a, ", balls=", this.b, Separators.RPAREN);
    }
}
