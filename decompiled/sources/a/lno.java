package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lno {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f20356a;
    public final boolean b;

    public lno(Map map, boolean z) {
        map.getClass();
        this.f20356a = map;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lno)) {
            return false;
        }
        lno lnoVar = (lno) obj;
        return Intrinsics.d(this.f20356a, lnoVar.f20356a) && this.b == lnoVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f20356a.hashCode() * 31);
    }

    public final String toString() {
        return "CategorySubGamesExpanded(subGamesExpanded=" + this.f20356a + ", userInteracted=" + this.b + Separators.RPAREN;
    }
}
