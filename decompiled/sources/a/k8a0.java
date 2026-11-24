package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class k8a0 {
    public static final j8a0 Companion = new j8a0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17864a;
    public final List b;
    public final String c;
    public final d8a0 d;

    static {
        c8a0 c8a0Var = d8a0.Companion;
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new wm90((byte) 26)), maz.a(wezVar, new wm90((byte) 27)), null, null};
    }

    public /* synthetic */ k8a0(int i, List list, List list2, String str, d8a0 d8a0Var) {
        if ((i & 1) == 0) {
            this.f17864a = null;
        } else {
            this.f17864a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d8a0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8a0)) {
            return false;
        }
        k8a0 k8a0Var = (k8a0) obj;
        return Intrinsics.d(this.f17864a, k8a0Var.f17864a) && Intrinsics.d(this.b, k8a0Var.b) && Intrinsics.d(this.c, k8a0Var.c) && Intrinsics.d(this.d, k8a0Var.d);
    }

    public final int hashCode() {
        List list = this.f17864a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        d8a0 d8a0Var = this.d;
        return iHashCode3 + (d8a0Var != null ? d8a0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("PlayerMenuResponse(teams=", ", players=", this.f17864a, ", sportId=", this.b);
        sbT.append(this.c);
        sbT.append(", response=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
