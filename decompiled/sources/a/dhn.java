package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class dhn {
    public static final chn Companion = new chn();
    public static final a8z[] c = {maz.a(wez.f39042a, new dcn(11)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6099a;
    public final String b;

    public /* synthetic */ dhn(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f6099a = null;
        } else {
            this.f6099a = list;
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
        if (!(obj instanceof dhn)) {
            return false;
        }
        dhn dhnVar = (dhn) obj;
        return Intrinsics.d(this.f6099a, dhnVar.f6099a) && Intrinsics.d(this.b, dhnVar.b);
    }

    public final int hashCode() {
        List list = this.f6099a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "EarnedTableResponse(rankingsBreakdownResponses=" + this.f6099a + ", tournType=" + this.b + Separators.RPAREN;
    }
}
