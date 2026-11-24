package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20650a;
    public final Integer b;
    public final String c;
    public final List d;

    public lu0(long j, Integer num, String str, List list) {
        this.f20650a = j;
        this.b = num;
        this.c = str;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu0)) {
            return false;
        }
        lu0 lu0Var = (lu0) obj;
        return this.f20650a == lu0Var.f20650a && Intrinsics.d(this.b, lu0Var.b) && Intrinsics.d(this.c, lu0Var.c) && Intrinsics.d(this.d, lu0Var.d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f20650a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorGameMetricsModel(partId=");
        sb.append(this.f20650a);
        sb.append(", index=");
        sb.append(this.b);
        ua80.t(", screen=", this.c, ", launchEntities=", sb, this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
