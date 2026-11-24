package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class n1u0 {
    public static final m1u0 Companion = new m1u0();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new tht0(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f22770a;
    public final Integer b;
    public final String c;
    public final List d;

    public /* synthetic */ n1u0(int i, Integer num, Integer num2, String str, List list) {
        if ((i & 1) == 0) {
            this.f22770a = null;
        } else {
            this.f22770a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
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
        if (!(obj instanceof n1u0)) {
            return false;
        }
        n1u0 n1u0Var = (n1u0) obj;
        return Intrinsics.d(this.f22770a, n1u0Var.f22770a) && Intrinsics.d(this.b, n1u0Var.b) && Intrinsics.d(this.c, n1u0Var.c) && Intrinsics.d(this.d, n1u0Var.d);
    }

    public final int hashCode() {
        Integer num = this.f22770a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return rw2.m(this.c, ", matchInfo=", Separators.RPAREN, hne.q("ValorantStatisticResponse(currentRound=", this.f22770a, ", stateRound=", this.b, ", mapName="), this.d);
    }
}
