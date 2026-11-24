package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class rjo0 {
    public static final qjo0 Companion = new qjo0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30605a;
    public final Integer b;

    public /* synthetic */ rjo0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f30605a = null;
        } else {
            this.f30605a = str;
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
        if (!(obj instanceof rjo0)) {
            return false;
        }
        rjo0 rjo0Var = (rjo0) obj;
        return Intrinsics.d(this.f30605a, rjo0Var.f30605a) && Intrinsics.d(this.b, rjo0Var.b);
    }

    public final int hashCode() {
        String str = this.f30605a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "TableFooterResponse(title=" + this.f30605a + ", color=" + this.b + Separators.RPAREN;
    }
}
