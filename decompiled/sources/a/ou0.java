package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ou0 {
    public static final nu0 Companion = new nu0();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new mg0(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25853a;
    public final Integer b;
    public final String c;
    public final List d;

    public /* synthetic */ ou0(int i, long j, Integer num, String str, List list) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, mu0.f22390a.getDescriptor());
            throw null;
        }
        this.f25853a = j;
        this.b = num;
        this.c = str;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou0)) {
            return false;
        }
        ou0 ou0Var = (ou0) obj;
        return this.f25853a == ou0Var.f25853a && Intrinsics.d(this.b, ou0Var.b) && Intrinsics.d(this.c, ou0Var.c) && Intrinsics.d(this.d, ou0Var.d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f25853a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorGameMetricsRequest(partId=");
        sb.append(this.f25853a);
        sb.append(", index=");
        sb.append(this.b);
        ua80.t(", screen=", this.c, ", launchEntities=", sb, this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public ou0(long j, Integer num, String str, ArrayList arrayList) {
        this.f25853a = j;
        this.b = num;
        this.c = str;
        this.d = arrayList;
    }
}
