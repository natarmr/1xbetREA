package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class jz90 {
    public static final iz90 Companion = new iz90();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17400a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new wm90((byte) 11)), maz.a(wezVar, new wm90((byte) 12))};
    }

    public /* synthetic */ jz90(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f17400a = null;
        } else {
            this.f17400a = list;
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
        if (!(obj instanceof jz90)) {
            return false;
        }
        jz90 jz90Var = (jz90) obj;
        return Intrinsics.d(this.f17400a, jz90Var.f17400a) && Intrinsics.d(this.b, jz90Var.b);
    }

    public final int hashCode() {
        List list = this.f17400a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("PlayerBiographyInfoResponse(biographyResponse=", ", photosResponse=", this.f17400a, Separators.RPAREN, this.b);
    }
}
