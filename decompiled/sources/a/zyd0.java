package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class zyd0 {
    public static final yyd0 Companion = new yyd0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45202a;
    public final Integer b;

    public /* synthetic */ zyd0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f45202a = null;
        } else {
            this.f45202a = str;
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
        if (!(obj instanceof zyd0)) {
            return false;
        }
        zyd0 zyd0Var = (zyd0) obj;
        return Intrinsics.d(this.f45202a, zyd0Var.f45202a) && Intrinsics.d(this.b, zyd0Var.b);
    }

    public final int hashCode() {
        String str = this.f45202a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "RainbowStatisticMatchesComparisonTeamBannedMapsResponse(name=" + this.f45202a + ", count=" + this.b + Separators.RPAREN;
    }
}
