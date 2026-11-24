package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class xyr0 {
    public static final wyr0 Companion = new wyr0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zyr0 f41719a;
    public final Long b;
    public final Long c;
    public final String d;

    public /* synthetic */ xyr0(int i, zyr0 zyr0Var, Long l, Long l2, String str) {
        if ((i & 1) == 0) {
            this.f41719a = null;
        } else {
            this.f41719a = zyr0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyr0)) {
            return false;
        }
        xyr0 xyr0Var = (xyr0) obj;
        return this.f41719a == xyr0Var.f41719a && Intrinsics.d(this.b, xyr0Var.b) && Intrinsics.d(this.c, xyr0Var.c) && Intrinsics.d(this.d, xyr0Var.d);
    }

    public final int hashCode() {
        zyr0 zyr0Var = this.f41719a;
        int iHashCode = (zyr0Var == null ? 0 : zyr0Var.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Counter(type=" + this.f41719a + ", eventDt=" + this.b + ", secondsToExpire=" + this.c + ", title=" + this.d + Separators.RPAREN;
    }
}
