package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class kfo {
    public static final hfo Companion = new hfo();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18205a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new urn((byte) 21)), maz.a(wezVar, new urn((byte) 24))};
    }

    public /* synthetic */ kfo(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f18205a = null;
        } else {
            this.f18205a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfo)) {
            return false;
        }
        kfo kfoVar = (kfo) obj;
        return Intrinsics.d(this.f18205a, kfoVar.f18205a) && Intrinsics.d(this.b, kfoVar.b);
    }

    public final int hashCode() {
        List list = this.f18205a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("EventParamsResponse(params=", ", playerNames=", this.f18205a, Separators.RPAREN, this.b);
    }
}
