package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rha0 {
    public static final rha0 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30481a;
    public final List b;
    public final List c;
    public final Map d;
    public final Map e;

    static {
        iun iunVar = iun.f15405a;
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        f = new rha0(0, iunVar, iunVar, lunVar, lunVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rha0(int i, List list, List list2, Map map, Map map2) {
        list.getClass();
        list2.getClass();
        this.f30481a = i;
        this.b = list;
        this.c = list2;
        this.d = map;
        this.e = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rha0)) {
            return false;
        }
        rha0 rha0Var = (rha0) obj;
        return this.f30481a == rha0Var.f30481a && Intrinsics.d(this.b, rha0Var.b) && Intrinsics.d(this.c, rha0Var.c) && this.d.equals(rha0Var.d) && this.e.equals(rha0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ohs0.f(this.d, dw9.a(dw9.a(Integer.hashCode(this.f30481a ? 1 : 0) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        return "PlayersStatisticCricketDataModel(selectedTab=" + (this.f30481a ? 1 : 0) + ", teams=" + this.b + ", innings=" + this.c + ", tableDataTypes=" + this.d + ", tables=" + this.e + Separators.RPAREN;
    }
}
