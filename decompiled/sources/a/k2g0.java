package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17570a;
    public final ms2 b;
    public final List c;
    public final Set d;

    public k2g0(String str, ms2 ms2Var, List list, Set set) {
        list.getClass();
        set.getClass();
        this.f17570a = str;
        this.b = ms2Var;
        this.c = list;
        this.d = set;
    }

    public static k2g0 a(k2g0 k2g0Var, wq2 wq2Var, List list, Set set, int i) {
        String str = (i & 1) != 0 ? k2g0Var.f17570a : "bet_favor_events";
        ms2 ms2Var = wq2Var;
        if ((i & 2) != 0) {
            ms2Var = k2g0Var.b;
        }
        if ((i & 4) != 0) {
            list = k2g0Var.c;
        }
        if ((i & 8) != 0) {
            set = k2g0Var.d;
        }
        list.getClass();
        set.getClass();
        return new k2g0(str, ms2Var, list, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2g0)) {
            return false;
        }
        k2g0 k2g0Var = (k2g0) obj;
        return this.f17570a.equals(k2g0Var.f17570a) && this.b.equals(k2g0Var.b) && Intrinsics.d(this.c, k2g0Var.c) && Intrinsics.d(this.d, k2g0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a((this.b.hashCode() + (this.f17570a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "ResultGameCardDelegateState(screen=" + this.f17570a + ", entryPoint=" + this.b + ", resultGameList=" + this.c + ", expandedHistoryGamesIds=" + this.d + Separators.RPAREN;
    }
}
