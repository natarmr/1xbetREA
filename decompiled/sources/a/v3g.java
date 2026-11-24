package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v3g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36731a;
    public final boolean b;
    public final List c;

    public v3g(int i, List list, boolean z) {
        list.getClass();
        this.f36731a = i;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3g)) {
            return false;
        }
        v3g v3gVar = (v3g) obj;
        return this.f36731a == v3gVar.f36731a && this.b == v3gVar.b && Intrinsics.d(this.c, v3gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Integer.hashCode(this.f36731a) * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(h97.l(this.f36731a, "CyberCSMatchesStatisticMatchTeamModel(score=", ", winner=", ", players=", this.b), this.c, Separators.RPAREN);
    }
}
