package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class pu10 {
    public static final fu10 Companion = new fu10();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27591a;
    public final Long b;
    public final lu10 c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new gf10((byte) 20)), null, null, maz.a(wezVar, new gf10((byte) 21))};
    }

    public /* synthetic */ pu10(int i, List list, Long l, lu10 lu10Var, List list2) {
        if ((i & 1) == 0) {
            this.f27591a = null;
        } else {
            this.f27591a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = lu10Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu10)) {
            return false;
        }
        pu10 pu10Var = (pu10) obj;
        return Intrinsics.d(this.f27591a, pu10Var.f27591a) && Intrinsics.d(this.b, pu10Var.b) && Intrinsics.d(this.c, pu10Var.c) && Intrinsics.d(this.d, pu10Var.d);
    }

    public final int hashCode() {
        List list = this.f27591a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        lu10 lu10Var = this.c;
        int iHashCode3 = (iHashCode2 + (lu10Var == null ? 0 : lu10Var.hashCode())) * 31;
        List list2 = this.d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "MainFeedChampsResponse(mainLigas=" + this.f27591a + ", gamesCount=" + this.b + ", sport=" + this.c + ", tabs=" + this.d + Separators.RPAREN;
    }
}
