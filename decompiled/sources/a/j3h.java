package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class j3h {
    public static final i3h Companion = new i3h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f15832a;
    public final Integer b;

    public /* synthetic */ j3h(int i, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f15832a = null;
        } else {
            this.f15832a = l;
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
        if (!(obj instanceof j3h)) {
            return false;
        }
        j3h j3hVar = (j3h) obj;
        return Intrinsics.d(this.f15832a, j3hVar.f15832a) && Intrinsics.d(this.b, j3hVar.b);
    }

    public final int hashCode() {
        Long l = this.f15832a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "CyberLolGameStatusResponse(gameDuration=" + this.f15832a + ", gameStatus=" + this.b + Separators.RPAREN;
    }
}
