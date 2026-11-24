package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class dft {
    public static final cft Companion = new cft();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new tet(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6016a;
    public final List b;

    public /* synthetic */ dft(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f6016a = null;
        } else {
            this.f6016a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dft)) {
            return false;
        }
        dft dftVar = (dft) obj;
        return Intrinsics.d(this.f6016a, dftVar.f6016a) && Intrinsics.d(this.b, dftVar.b);
    }

    public final int hashCode() {
        Integer num = this.f6016a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f6016a, "GemsOdysseyCoeffInfoResponse(crystal=", ", coeffInfo=", Separators.RPAREN, this.b);
    }
}
