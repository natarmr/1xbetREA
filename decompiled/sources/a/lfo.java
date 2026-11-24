package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class lfo {
    public static final ifo Companion = new ifo();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19966a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new urn((byte) 22)), maz.a(wezVar, new urn((byte) 25))};
    }

    public /* synthetic */ lfo(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f19966a = null;
        } else {
            this.f19966a = list;
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
        if (!(obj instanceof lfo)) {
            return false;
        }
        lfo lfoVar = (lfo) obj;
        return Intrinsics.d(this.f19966a, lfoVar.f19966a) && Intrinsics.d(this.b, lfoVar.b);
    }

    public final int hashCode() {
        List list = this.f19966a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("EventParamsResponse(params=", ", playerNames=", this.f19966a, Separators.RPAREN, this.b);
    }
}
