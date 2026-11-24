package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xoh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aph f41219a;
    public final String b;
    public final String c;
    public final int d;

    public xoh(aph aphVar, String str, String str2, int i) {
        str.getClass();
        this.f41219a = aphVar;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoh)) {
            return false;
        }
        xoh xohVar = (xoh) obj;
        return this.f41219a == xohVar.f41219a && Intrinsics.d(this.b, xohVar.b) && this.c.equals(xohVar.c) && this.d == xohVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ua80.b(ua80.b(this.f41219a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberUFCStatisticsBeatMapCellUiModel(zone=");
        sb.append(this.f41219a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", value=");
        return brm0.j(this.d, this.c, ", progress=", Separators.RPAREN, sb);
    }
}
