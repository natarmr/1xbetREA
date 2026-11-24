package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class y9r {
    public static final x9r Companion = new x9r();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new s9r(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f42263a;
    public final List b;

    public /* synthetic */ y9r(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f42263a = null;
        } else {
            this.f42263a = num;
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
        if (!(obj instanceof y9r)) {
            return false;
        }
        y9r y9rVar = (y9r) obj;
        return Intrinsics.d(this.f42263a, y9rVar.f42263a) && Intrinsics.d(this.b, y9rVar.b);
    }

    public final int hashCode() {
        Integer num = this.f42263a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f42263a, "FruitBlastWinCombinationResponse(product=", ", winCoordinates=", Separators.RPAREN, this.b);
    }
}
