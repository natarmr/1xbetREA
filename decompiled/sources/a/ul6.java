package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ul6 {
    public static final tl6 Companion = new tl6();
    public static final a8z[] b = {maz.a(wez.f39042a, new lg6(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f35857a;

    public /* synthetic */ ul6(int i, Map map) {
        if ((i & 1) == 0) {
            this.f35857a = null;
        } else {
            this.f35857a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ul6) && Intrinsics.d(this.f35857a, ((ul6) obj).f35857a);
    }

    public final int hashCode() {
        Map map = this.f35857a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return "BetBuilderStatisticScoreResponse(main=" + this.f35857a + Separators.RPAREN;
    }
}
