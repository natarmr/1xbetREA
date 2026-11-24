package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class eyp {
    public static final dyp Companion = new dyp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f8637a;
    public final Float b;

    public /* synthetic */ eyp(int i, Float f, Integer num) {
        if ((i & 1) == 0) {
            this.f8637a = null;
        } else {
            this.f8637a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyp)) {
            return false;
        }
        eyp eypVar = (eyp) obj;
        return Intrinsics.d(this.f8637a, eypVar.f8637a) && Intrinsics.d(this.b, eypVar.b);
    }

    public final int hashCode() {
        Integer num = this.f8637a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f = this.b;
        return iHashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "FighterStatisticValueResponse(count=" + this.f8637a + ", percent=" + this.b + Separators.RPAREN;
    }
}
