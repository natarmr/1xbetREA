package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class obq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xbq f24994a;
    public final kcq b;
    public final List c;

    public obq(xbq xbqVar, kcq kcqVar, List list) {
        list.getClass();
        this.f24994a = xbqVar;
        this.b = kcqVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obq)) {
            return false;
        }
        obq obqVar = (obq) obj;
        return this.f24994a.equals(obqVar.f24994a) && this.b.equals(obqVar.b) && Intrinsics.d(this.c, obqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f24994a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinanceDataModel(financeGraphModel=");
        sb.append(this.f24994a);
        sb.append(", financeObjectModel=");
        sb.append(this.b);
        sb.append(", financeInstrumentModelList=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
