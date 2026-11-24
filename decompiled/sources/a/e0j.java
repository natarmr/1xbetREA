package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class e0j {
    public static final a0j Companion = new a0j();
    public static final a8z[] c = {maz.a(wez.f39042a, new bmh(16)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6992a;
    public final Integer b;

    public /* synthetic */ e0j(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f6992a = null;
        } else {
            this.f6992a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0j)) {
            return false;
        }
        e0j e0jVar = (e0j) obj;
        return Intrinsics.d(this.f6992a, e0jVar.f6992a) && Intrinsics.d(this.b, e0jVar.b);
    }

    public final int hashCode() {
        List list = this.f6992a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "DailyPrizeResponse(prizes=" + this.f6992a + ", prizeIndex=" + this.b + Separators.RPAREN;
    }
}
