package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d3w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3w f5424a;
    public final boolean b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final boolean h;

    public d3w(n3w n3wVar, boolean z, List list, boolean z2, boolean z3, boolean z4, long j, boolean z5) {
        list.getClass();
        this.f5424a = n3wVar;
        this.b = z;
        this.c = list;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j;
        this.h = z5;
    }

    public static d3w a(d3w d3wVar, n3w n3wVar, List list, boolean z, boolean z2, long j, boolean z3, int i) {
        if ((i & 1) != 0) {
            n3wVar = d3wVar.f5424a;
        }
        n3w n3wVar2 = n3wVar;
        boolean z4 = (i & 2) != 0 ? d3wVar.b : false;
        if ((i & 4) != 0) {
            list = d3wVar.c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z = d3wVar.d;
        }
        boolean z5 = z;
        boolean z6 = (i & 16) != 0 ? d3wVar.e : false;
        boolean z7 = (i & 32) != 0 ? d3wVar.f : z2;
        long j2 = (i & 64) != 0 ? d3wVar.g : j;
        boolean z8 = (i & 128) != 0 ? d3wVar.h : z3;
        d3wVar.getClass();
        n3wVar2.getClass();
        list2.getClass();
        return new d3w(n3wVar2, z4, list2, z5, z6, z7, j2, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3w)) {
            return false;
        }
        d3w d3wVar = (d3w) obj;
        return this.f5424a.equals(d3wVar.f5424a) && this.b == d3wVar.b && Intrinsics.d(this.c, d3wVar.c) && this.d == d3wVar.d && this.e == d3wVar.e && this.f == d3wVar.f && this.g == d3wVar.g && this.h == d3wVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + rw2.b(brm0.e(brm0.e(brm0.e(dw9.a(brm0.e(this.f5424a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryInfoScreenModel(historyItem=");
        sb.append(this.f5424a);
        sb.append(", fromScanner=");
        sb.append(this.b);
        sb.append(", sports=");
        rz4.z(sb, ", isRefresh=", this.c, ", isProgress=", this.d);
        ua80.u(", isError=", ", lastUpdateTime=", sb, this.e, this.f);
        hne.t(this.g, ", canUpdateLiveGames=", sb, this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
