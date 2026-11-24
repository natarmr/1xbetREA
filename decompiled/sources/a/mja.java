package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21886a;
    public final boolean b;
    public final long c;

    public mja(long j, List list, boolean z) {
        list.getClass();
        this.f21886a = list;
        this.b = z;
        this.c = j;
    }

    public static mja a(mja mjaVar, List list) {
        boolean z = mjaVar.b;
        long j = mjaVar.c;
        list.getClass();
        return new mja(j, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mja)) {
            return false;
        }
        mja mjaVar = (mja) obj;
        return Intrinsics.d(this.f21886a, mjaVar.f21886a) && this.b == mjaVar.b && znq0.e(this.c, mjaVar.c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + brm0.e(this.f21886a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        String strH = znq0.h(this.c);
        StringBuilder sb = new StringBuilder("CardListModel(cards=");
        sb.append(this.f21886a);
        sb.append(", switchFilter=");
        sb.append(this.b);
        sb.append(", timestamp=");
        return axq.n(sb, strH, Separators.RPAREN);
    }
}
