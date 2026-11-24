package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bpg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2982a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;

    public bpg0(int i, int i2, int i3, int i4, String str) {
        str.getClass();
        this.f2982a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpg0)) {
            return false;
        }
        bpg0 bpg0Var = (bpg0) obj;
        return this.f2982a == bpg0Var.f2982a && this.b == bpg0Var.b && Intrinsics.d(this.c, bpg0Var.c) && this.d == bpg0Var.d && this.e == bpg0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, ua80.b(twn.a(this.b, Integer.hashCode(this.f2982a) * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("RussianLottoPlayerItemParamsUiModel(positionX=", this.f2982a, ", positionY=", ", num=", this.b);
        twn.w(this.d, this.c, ", background=", ", color=", sbT);
        return rz4.j(this.e, Separators.RPAREN, sbT);
    }
}
