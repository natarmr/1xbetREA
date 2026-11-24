package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25518a;
    public final List b;
    public final int c;
    public final dgs d;

    public oms(List list, List list2, int i, dgs dgsVar) {
        list.getClass();
        list2.getClass();
        this.f25518a = list;
        this.b = list2;
        this.c = i;
        this.d = dgsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oms)) {
            return false;
        }
        oms omsVar = (oms) obj;
        return Intrinsics.d(this.f25518a, omsVar.f25518a) && Intrinsics.d(this.b, omsVar.b) && this.c == omsVar.c && this.d.equals(omsVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, dw9.a(this.f25518a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("GameModel(teams=", ", players=", this.f25518a, ", sportId=", this.b);
        sbT.append(this.c);
        sbT.append(", info=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
