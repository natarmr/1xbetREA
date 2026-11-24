package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hyx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13881a;
    public final List b;

    public hyx(long j, List list) {
        list.getClass();
        this.f13881a = j;
        this.b = list;
    }

    public static hyx a(hyx hyxVar, long j, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            j = hyxVar.f13881a;
        }
        List list = arrayList;
        if ((i & 2) != 0) {
            list = hyxVar.b;
        }
        list.getClass();
        return new hyx(j, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyx)) {
            return false;
        }
        hyx hyxVar = (hyx) obj;
        return this.f13881a == hyxVar.f13881a && Intrinsics.d(this.b, hyxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f13881a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f13881a, "ItemStatisticsUiStateModel(selectedTabId=", ", expandedPlayerIds=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
