package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class hc40 {
    public static final gc40 Companion = new gc40();
    public static final a8z[] b = {maz.a(wez.f39042a, new ec40(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f12802a;

    public /* synthetic */ hc40(int i, Map map) {
        if ((i & 1) == 0) {
            this.f12802a = null;
        } else {
            this.f12802a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hc40) && Intrinsics.d(this.f12802a, ((hc40) obj).f12802a);
    }

    public final int hashCode() {
        Map map = this.f12802a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return "MetaHeroesResponse(positions=" + this.f12802a + Separators.RPAREN;
    }
}
