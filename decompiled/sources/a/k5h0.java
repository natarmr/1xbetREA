package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class k5h0 {
    public static final i5h0 Companion = new i5h0();
    public static final a8z[] b = {maz.a(wez.f39042a, new yxg0(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f17720a;

    public /* synthetic */ k5h0(int i, Map map) {
        if ((i & 1) == 0) {
            this.f17720a = null;
        } else {
            this.f17720a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5h0) && Intrinsics.d(this.f17720a, ((k5h0) obj).f17720a);
    }

    public final int hashCode() {
        Map map = this.f17720a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return "ScoreStatisticResponse(main=" + this.f17720a + Separators.RPAREN;
    }
}
