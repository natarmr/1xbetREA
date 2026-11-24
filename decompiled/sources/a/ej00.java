package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ej00 {
    public static final dj00 Companion = new dj00();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new x800((byte) 4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f7884a;
    public final Integer b;
    public final List c;

    public /* synthetic */ ej00(int i, Boolean bool, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f7884a = null;
        } else {
            this.f7884a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej00)) {
            return false;
        }
        ej00 ej00Var = (ej00) obj;
        return Intrinsics.d(this.f7884a, ej00Var.f7884a) && Intrinsics.d(this.b, ej00Var.b) && Intrinsics.d(this.c, ej00Var.c);
    }

    public final int hashCode() {
        Boolean bool = this.f7884a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveExpressTabsResponseV2(isNew=");
        sb.append(this.f7884a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", tabItems=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
