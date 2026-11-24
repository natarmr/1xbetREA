package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class trf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34420a;
    public final int b;
    public final wpf c;
    public final Map d;
    public final Map e;

    public trf(List list, int i, wpf wpfVar, Map map, Map map2) {
        list.getClass();
        this.f34420a = list;
        this.b = i;
        this.c = wpfVar;
        this.d = map;
        this.e = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trf)) {
            return false;
        }
        trf trfVar = (trf) obj;
        return Intrinsics.d(this.f34420a, trfVar.f34420a) && this.b == trfVar.b && this.c == trfVar.c && this.d.equals(trfVar.d) && this.e.equals(trfVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ohs0.f(this.d, (this.c.hashCode() + twn.a(this.b, this.f34420a.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "Cs2StatisticTeamModel(playersStatistic=" + this.f34420a + ", scoreTeam=" + this.b + ", teamRole=" + this.c + ", roundHistoryFirstPeriod=" + this.d + ", roundHistorySecondPeriod=" + this.e + Separators.RPAREN;
    }
}
