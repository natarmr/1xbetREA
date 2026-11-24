package a;

import android.gov.nist.core.Separators;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class znn0 extends ijj0 {
    public final ArrayList c;
    public final ArrayList d;

    public znn0(ArrayList arrayList, ArrayList arrayList2) {
        this.c = arrayList;
        this.d = arrayList2;
    }

    @Override // a.ijj0
    public final Shader b(long j) {
        long jU = p7x.u(j);
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = this.d;
        ntr.x0(arrayList, arrayList2);
        if (Build.VERSION.SDK_INT < 29) {
            int iZ = ntr.Z(arrayList);
            return new SweepGradient(Float.intBitsToFloat((int) (jU >> 32)), Float.intBitsToFloat((int) (jU & 4294967295L)), ntr.h0(iZ, arrayList), ntr.i0(iZ, arrayList2, arrayList));
        }
        return vbv.f37157a.c(jU, ntr.v0(arrayList), CollectionsKt.I0(arrayList2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znn0)) {
            return false;
        }
        znn0 znn0Var = (znn0) obj;
        return ne60.c(9205357640488583168L, 9205357640488583168L) && this.c.equals(znn0Var.c) && this.d.equals(znn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.g(this.c, Long.hashCode(9205357640488583168L) * 31, 31);
    }

    public final String toString() {
        return "SweepGradient(colors=" + this.c + ", stops=" + this.d + Separators.RPAREN;
    }
}
