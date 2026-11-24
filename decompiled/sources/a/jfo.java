package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class jfo {
    public static final gfo Companion = new gfo();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16438a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new urn((byte) 20)), maz.a(wezVar, new urn((byte) 23))};
    }

    public /* synthetic */ jfo(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f16438a = null;
        } else {
            this.f16438a = list;
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
        if (!(obj instanceof jfo)) {
            return false;
        }
        jfo jfoVar = (jfo) obj;
        return Intrinsics.d(this.f16438a, jfoVar.f16438a) && Intrinsics.d(this.b, jfoVar.b);
    }

    public final int hashCode() {
        List list = this.f16438a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("EventParamsResponse(params=", ", playerNames=", this.f16438a, Separators.RPAREN, this.b);
    }
}
