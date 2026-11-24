package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class drj0 {
    public static final brj0 Companion = new brj0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6562a;
    public final List b;
    public final Integer c;
    public final vqj0 d;

    static {
        uqj0 uqj0Var = vqj0.Companion;
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new hwi0((byte) 18)), maz.a(wezVar, new hwi0((byte) 19)), null, null};
    }

    public /* synthetic */ drj0(int i, List list, List list2, Integer num, vqj0 vqj0Var) {
        if ((i & 1) == 0) {
            this.f6562a = null;
        } else {
            this.f6562a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = vqj0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drj0)) {
            return false;
        }
        drj0 drj0Var = (drj0) obj;
        return Intrinsics.d(this.f6562a, drj0Var.f6562a) && Intrinsics.d(this.b, drj0Var.b) && Intrinsics.d(this.c, drj0Var.c) && Intrinsics.d(this.d, drj0Var.d);
    }

    public final int hashCode() {
        List list = this.f6562a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        vqj0 vqj0Var = this.d;
        return iHashCode3 + (vqj0Var != null ? vqj0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("ShortGameResponse(teams=", ", players=", this.f6562a, ", sportId=", this.b);
        sbT.append(this.c);
        sbT.append(", response=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
