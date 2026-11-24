package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i580 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14181a;
    public final i3m0 b;
    public final String c;

    public i580(List list, i3m0 i3m0Var, String str) {
        list.getClass();
        this.f14181a = list;
        this.b = i3m0Var;
        this.c = str;
    }

    public static i580 a(i580 i580Var, List list, i3m0 i3m0Var, String str, int i) {
        if ((i & 1) != 0) {
            list = i580Var.f14181a;
        }
        if ((i & 2) != 0) {
            i3m0Var = i580Var.b;
        }
        if ((i & 4) != 0) {
            str = i580Var.c;
        }
        list.getClass();
        return new i580(list, i3m0Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i580)) {
            return false;
        }
        i580 i580Var = (i580) obj;
        return Intrinsics.d(this.f14181a, i580Var.f14181a) && this.b.equals(i580Var.b) && Intrinsics.d(this.c, i580Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f14181a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpponentsStateModel(stages=");
        sb.append(this.f14181a);
        sb.append(", stageType=");
        sb.append(this.b);
        sb.append(", group=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
