package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class sgo {
    public static final qgo Companion = new qgo();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32171a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new ago((byte) 9)), maz.a(wezVar, new ago((byte) 11))};
    }

    public /* synthetic */ sgo(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f32171a = null;
        } else {
            this.f32171a = list;
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
        if (!(obj instanceof sgo)) {
            return false;
        }
        sgo sgoVar = (sgo) obj;
        return Intrinsics.d(this.f32171a, sgoVar.f32171a) && Intrinsics.d(this.b, sgoVar.b);
    }

    public final int hashCode() {
        List list = this.f32171a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("EventParamsResponse(params=", ", playerNames=", this.f32171a, Separators.RPAREN, this.b);
    }
}
