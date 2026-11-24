package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v1g0 implements d2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wq2 f36628a;
    public final Set b;

    public v1g0(wq2 wq2Var, Set set) {
        set.getClass();
        this.f36628a = wq2Var;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v1g0) {
            v1g0 v1g0Var = (v1g0) obj;
            if (this.f36628a == v1g0Var.f36628a && Intrinsics.d(this.b, v1g0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f36628a.hashCode() + 689014232) * 31);
    }

    public final String toString() {
        return "Initialize(screen=bet_favor_events, entryPointType=" + this.f36628a + ", expandedHistoryGamesIds=" + this.b + Separators.RPAREN;
    }
}
