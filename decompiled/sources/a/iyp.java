package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class iyp {
    public static final hyp Companion = new hyp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eyp f15598a;
    public final eyp b;
    public final eyp c;

    public /* synthetic */ iyp(int i, eyp eypVar, eyp eypVar2, eyp eypVar3) {
        if ((i & 1) == 0) {
            this.f15598a = null;
        } else {
            this.f15598a = eypVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = eypVar2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = eypVar3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyp)) {
            return false;
        }
        iyp iypVar = (iyp) obj;
        return Intrinsics.d(this.f15598a, iypVar.f15598a) && Intrinsics.d(this.b, iypVar.b) && Intrinsics.d(this.c, iypVar.c);
    }

    public final int hashCode() {
        eyp eypVar = this.f15598a;
        int iHashCode = (eypVar == null ? 0 : eypVar.hashCode()) * 31;
        eyp eypVar2 = this.b;
        int iHashCode2 = (iHashCode + (eypVar2 == null ? 0 : eypVar2.hashCode())) * 31;
        eyp eypVar3 = this.c;
        return iHashCode2 + (eypVar3 != null ? eypVar3.hashCode() : 0);
    }

    public final String toString() {
        return "FighterStatisticWinMethodsResponse(koTko=" + this.f15598a + ", decision=" + this.b + ", sub=" + this.c + Separators.RPAREN;
    }
}
