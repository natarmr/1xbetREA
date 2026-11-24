package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class jgf {
    public static final igf Companion = new igf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f16475a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ jgf(int i, Integer num, Integer num2, Integer num3, Integer num4) {
        if ((i & 1) == 0) {
            this.f16475a = null;
        } else {
            this.f16475a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgf)) {
            return false;
        }
        jgf jgfVar = (jgf) obj;
        return Intrinsics.d(this.f16475a, jgfVar.f16475a) && Intrinsics.d(this.b, jgfVar.b) && Intrinsics.d(this.c, jgfVar.c) && Intrinsics.d(this.d, jgfVar.d);
    }

    public final int hashCode() {
        Integer num = this.f16475a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return ua80.l(hne.q("CrystalMatrixResponse(color=", this.f16475a, ", row=", this.b, ", column="), this.c, ", winCombination=", this.d, Separators.RPAREN);
    }
}
