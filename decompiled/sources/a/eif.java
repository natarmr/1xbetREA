package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class eif {
    public static final dif Companion = new dif();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new x5f(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f7856a;
    public final Integer b;
    public final Double c;
    public final List d;

    public /* synthetic */ eif(int i, Double d, Integer num, Double d2, List list) {
        if ((i & 1) == 0) {
            this.f7856a = null;
        } else {
            this.f7856a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eif)) {
            return false;
        }
        eif eifVar = (eif) obj;
        return Intrinsics.d(this.f7856a, eifVar.f7856a) && Intrinsics.d(this.b, eifVar.b) && Intrinsics.d(this.c, eifVar.c) && Intrinsics.d(this.d, eifVar.d);
    }

    public final int hashCode() {
        Double d = this.f7856a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d2 = this.c;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "CrystalWinComboResponse(coeff=" + this.f7856a + ", crystalType=" + this.b + ", winSum=" + this.c + ", winCrystalCoordinates=" + this.d + Separators.RPAREN;
    }
}
