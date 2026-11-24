package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class yg7 {
    public static final xg7 Companion = new xg7();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42573a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new t07((byte) 24)), maz.a(wezVar, new t07((byte) 25))};
    }

    public /* synthetic */ yg7(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f42573a = null;
        } else {
            this.f42573a = list;
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
        if (!(obj instanceof yg7)) {
            return false;
        }
        yg7 yg7Var = (yg7) obj;
        return Intrinsics.d(this.f42573a, yg7Var.f42573a) && Intrinsics.d(this.b, yg7Var.b);
    }

    public final int hashCode() {
        List list = this.f42573a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("EventParamsResponse(params=", ", playerNames=", this.f42573a, Separators.RPAREN, this.b);
    }
}
