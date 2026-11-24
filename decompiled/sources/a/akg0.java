package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class akg0 implements iqg {
    public static final zjg0 Companion = new zjg0();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new j6g0(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1021a;
    public final qig0 b;
    public final wjg0 c;
    public final List d;

    public /* synthetic */ akg0(int i, Integer num, qig0 qig0Var, wjg0 wjg0Var, List list) {
        if ((i & 1) == 0) {
            this.f1021a = null;
        } else {
            this.f1021a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = qig0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = wjg0Var;
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
        if (!(obj instanceof akg0)) {
            return false;
        }
        akg0 akg0Var = (akg0) obj;
        return Intrinsics.d(this.f1021a, akg0Var.f1021a) && Intrinsics.d(this.b, akg0Var.b) && Intrinsics.d(this.c, akg0Var.c) && Intrinsics.d(this.d, akg0Var.d);
    }

    public final int hashCode() {
        Integer num = this.f1021a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        qig0 qig0Var = this.b;
        int iHashCode2 = (iHashCode + (qig0Var == null ? 0 : qig0Var.hashCode())) * 31;
        wjg0 wjg0Var = this.c;
        int iHashCode3 = (iHashCode2 + (wjg0Var == null ? 0 : wjg0Var.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "RpsResponse(gameStatus=" + this.f1021a + ", gameInformation=" + this.b + ", animationRound=" + this.c + ", roundResult=" + this.d + Separators.RPAREN;
    }

    public akg0() {
        this.f1021a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
