package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class l5h0 {
    public static final j5h0 Companion = new j5h0();
    public static final a8z[] b = {maz.a(wez.f39042a, new yxg0(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f19456a;

    public /* synthetic */ l5h0(int i, Map map) {
        if ((i & 1) == 0) {
            this.f19456a = null;
        } else {
            this.f19456a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5h0) && Intrinsics.d(this.f19456a, ((l5h0) obj).f19456a);
    }

    public final int hashCode() {
        Map map = this.f19456a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return "ScoreStatisticResponse(main=" + this.f19456a + Separators.RPAREN;
    }
}
