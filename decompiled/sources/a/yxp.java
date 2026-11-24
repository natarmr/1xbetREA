package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class yxp {
    public static final xxp Companion = new xxp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eyp f43434a;
    public final eyp b;
    public final eyp c;

    public /* synthetic */ yxp(int i, eyp eypVar, eyp eypVar2, eyp eypVar3) {
        if ((i & 1) == 0) {
            this.f43434a = null;
        } else {
            this.f43434a = eypVar;
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
        if (!(obj instanceof yxp)) {
            return false;
        }
        yxp yxpVar = (yxp) obj;
        return Intrinsics.d(this.f43434a, yxpVar.f43434a) && Intrinsics.d(this.b, yxpVar.b) && Intrinsics.d(this.c, yxpVar.c);
    }

    public final int hashCode() {
        eyp eypVar = this.f43434a;
        int iHashCode = (eypVar == null ? 0 : eypVar.hashCode()) * 31;
        eyp eypVar2 = this.b;
        int iHashCode2 = (iHashCode + (eypVar2 == null ? 0 : eypVar2.hashCode())) * 31;
        eyp eypVar3 = this.c;
        return iHashCode2 + (eypVar3 != null ? eypVar3.hashCode() : 0);
    }

    public final String toString() {
        return "FighterStatisticStrikeTargetResponse(head=" + this.f43434a + ", body=" + this.b + ", leg=" + this.c + Separators.RPAREN;
    }
}
