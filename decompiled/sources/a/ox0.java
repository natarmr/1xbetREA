package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ox0 {
    public static final nx0 Companion = new nx0();
    public static final a8z[] c = {maz.a(wez.f39042a, new mg0(21)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25989a;
    public final String b;

    public /* synthetic */ ox0(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f25989a = null;
        } else {
            this.f25989a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox0)) {
            return false;
        }
        ox0 ox0Var = (ox0) obj;
        return Intrinsics.d(this.f25989a, ox0Var.f25989a) && Intrinsics.d(this.b, ox0Var.b);
    }

    public final int hashCode() {
        List list = this.f25989a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AggregatorGamesLiveGamesSettingsResponse(flags=" + this.f25989a + ", limits=" + this.b + Separators.RPAREN;
    }
}
