package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v0p implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36591a;

    public v0p(List list) {
        list.getClass();
        this.f36591a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0p) && Intrinsics.d(this.f36591a, ((v0p) obj).f36591a);
    }

    public final int hashCode() {
        return this.f36591a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f36591a, "FatalFuryStatisticsModel(roundTable=", Separators.RPAREN);
    }
}
