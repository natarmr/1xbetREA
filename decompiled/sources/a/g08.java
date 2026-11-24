package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class g08 implements iqg {
    public static final f08 Companion = new f08();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f10446a;
    public final gz7 b;
    public final dz7 c;
    public final List d;
    public final List e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, null, null, maz.a(wezVar, new os7((byte) 12)), maz.a(wezVar, new os7((byte) 13))};
    }

    public /* synthetic */ g08(int i, Integer num, gz7 gz7Var, dz7 dz7Var, List list, List list2) {
        if ((i & 1) == 0) {
            this.f10446a = null;
        } else {
            this.f10446a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = gz7Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = dz7Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g08)) {
            return false;
        }
        g08 g08Var = (g08) obj;
        return Intrinsics.d(this.f10446a, g08Var.f10446a) && Intrinsics.d(this.b, g08Var.b) && Intrinsics.d(this.c, g08Var.c) && Intrinsics.d(this.d, g08Var.d) && Intrinsics.d(this.e, g08Var.e);
    }

    public final int hashCode() {
        Integer num = this.f10446a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        gz7 gz7Var = this.b;
        int iHashCode2 = (iHashCode + (gz7Var == null ? 0 : gz7Var.hashCode())) * 31;
        dz7 dz7Var = this.c;
        int iHashCode3 = (iHashCode2 + (dz7Var == null ? 0 : dz7Var.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BigPigResponse(status=");
        sb.append(this.f10446a);
        sb.append(", currentThrow=");
        sb.append(this.b);
        sb.append(", currentThrowExtended=");
        sb.append(this.c);
        sb.append(", firstPlayerSeries=");
        sb.append(this.d);
        sb.append(", secondPlayerSeries=");
        return dw9.r(sb, this.e, Separators.RPAREN);
    }

    public g08() {
        this.f10446a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
