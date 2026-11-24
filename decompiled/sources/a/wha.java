package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class wha {
    public static final vha Companion = new vha();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39157a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new mn9((byte) 20)), maz.a(wezVar, new mn9((byte) 21)), maz.a(wezVar, new mn9((byte) 22))};
    }

    public /* synthetic */ wha(int i, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f39157a = null;
        } else {
            this.f39157a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wha)) {
            return false;
        }
        wha whaVar = (wha) obj;
        return Intrinsics.d(this.f39157a, whaVar.f39157a) && Intrinsics.d(this.b, whaVar.b) && Intrinsics.d(this.c, whaVar.c);
    }

    public final int hashCode() {
        List list = this.f39157a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(w6x.t("CardFootballTeamResponse(goalkeeper=", ", defenders=", this.f39157a, ", attackers=", this.b), this.c, Separators.RPAREN);
    }
}
