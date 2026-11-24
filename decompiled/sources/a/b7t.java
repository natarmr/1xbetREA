package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class b7t {
    public static final x6t Companion = new x6t();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new e6t(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f2124a;
    public final List b;

    public /* synthetic */ b7t(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f2124a = null;
        } else {
            this.f2124a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7t)) {
            return false;
        }
        b7t b7tVar = (b7t) obj;
        return Intrinsics.d(this.f2124a, b7tVar.f2124a) && Intrinsics.d(this.b, b7tVar.b);
    }

    public final int hashCode() {
        Long l = this.f2124a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "GamesLiveResultsResponse(id=" + this.f2124a + ", ligas=" + this.b + Separators.RPAREN;
    }
}
