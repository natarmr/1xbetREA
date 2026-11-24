package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class kiv {
    public static final jiv Companion = new jiv();
    public static final a8z[] c = {maz.a(wez.f39042a, new ldv(3)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18355a;
    public final String b;

    public /* synthetic */ kiv(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f18355a = null;
        } else {
            this.f18355a = list;
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
        if (!(obj instanceof kiv)) {
            return false;
        }
        kiv kivVar = (kiv) obj;
        return Intrinsics.d(this.f18355a, kivVar.f18355a) && Intrinsics.d(this.b, kivVar.b);
    }

    public final int hashCode() {
        List list = this.f18355a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsRankingResponse(breakdownResponses=" + this.f18355a + ", name=" + this.b + Separators.RPAREN;
    }
}
