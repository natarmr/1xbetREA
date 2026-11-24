package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ohz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25288a;

    public ohz(List list) {
        list.getClass();
        this.f25288a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ohz) && Intrinsics.d(this.f25288a, ((ohz) obj).f25288a);
    }

    public final int hashCode() {
        return this.f25288a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f25288a, "LeaderboardTimeFilterBottomContent(items=", Separators.RPAREN);
    }
}
