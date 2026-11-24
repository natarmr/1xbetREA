package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class iuf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15394a;
    public final long b;
    public final Integer c;
    public final Integer d;
    public final int e;
    public final boolean f;

    public iuf(int i, long j, Integer num, Integer num2, int i2, boolean z) {
        this.f15394a = i;
        this.b = j;
        this.c = num;
        this.d = num2;
        this.e = i2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iuf)) {
            return false;
        }
        iuf iufVar = (iuf) obj;
        return this.f15394a == iufVar.f15394a && znq0.e(this.b, iufVar.b) && Intrinsics.d(this.c, iufVar.c) && Intrinsics.d(this.d, iufVar.d) && this.e == iufVar.e && this.f == iufVar.f;
    }

    public final int hashCode() {
        int iB = rw2.b(Integer.hashCode(this.f15394a) * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return Boolean.hashCode(this.f) + twn.a(this.e, (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f15394a, "CupheadStatisticRoundModel(round=", ", time=", znq0.h(this.b), ", hp=");
        rz4.y(sbR, this.c, ", stage=", this.d, ", stageCount=");
        return ohs0.k(this.e, ", playerWin=", Separators.RPAREN, sbR, this.f);
    }
}
