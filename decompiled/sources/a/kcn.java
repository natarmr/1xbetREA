package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class kcn {
    public static final jcn Companion = new jcn();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18069a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new dcn((byte) 1)), maz.a(wezVar, new dcn((byte) 2))};
    }

    public /* synthetic */ kcn(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f18069a = null;
        } else {
            this.f18069a = list;
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
        if (!(obj instanceof kcn)) {
            return false;
        }
        kcn kcnVar = (kcn) obj;
        return Intrinsics.d(this.f18069a, kcnVar.f18069a) && Intrinsics.d(this.b, kcnVar.b);
    }

    public final int hashCode() {
        List list = this.f18069a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("EventParamsResponse(params=", ", playerNames=", this.f18069a, Separators.RPAREN, this.b);
    }
}
