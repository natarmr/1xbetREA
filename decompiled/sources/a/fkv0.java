package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class fkv0 {
    public static final ekv0 Companion = new ekv0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new y9v0((byte) 7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f9712a;
    public final List b;

    public /* synthetic */ fkv0(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f9712a = null;
        } else {
            this.f9712a = num;
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
        if (!(obj instanceof fkv0)) {
            return false;
        }
        fkv0 fkv0Var = (fkv0) obj;
        return Intrinsics.d(this.f9712a, fkv0Var.f9712a) && Intrinsics.d(this.b, fkv0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f9712a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f9712a, "WinningCombinationResponse(crystal=", ", winningCoordinates=", Separators.RPAREN, this.b);
    }
}
