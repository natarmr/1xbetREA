package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class mbe0 {
    public static final lbe0 Companion = new lbe0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f21503a;
    public final String b;

    public /* synthetic */ mbe0(int i, Double d, String str) {
        if ((i & 1) == 0) {
            this.f21503a = null;
        } else {
            this.f21503a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbe0)) {
            return false;
        }
        mbe0 mbe0Var = (mbe0) obj;
        return Intrinsics.d(this.f21503a, mbe0Var.f21503a) && Intrinsics.d(this.b, mbe0Var.b);
    }

    public final int hashCode() {
        Double d = this.f21503a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RealMoneyPrizeResponse(amount=" + this.f21503a + ", currency=" + this.b + Separators.RPAREN;
    }
}
