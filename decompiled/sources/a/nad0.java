package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nad0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23186a;
    public final int b;
    public final List c;

    public nad0(int i, int i2, List list) {
        list.getClass();
        this.f23186a = i;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nad0)) {
            return false;
        }
        nad0 nad0Var = (nad0) obj;
        return this.f23186a == nad0Var.f23186a && this.b == nad0Var.b && Intrinsics.d(this.c, nad0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f23186a) * 31, 31);
    }

    public final String toString() {
        return dw9.r(dw9.t("CyberRecommendVirtualGames(cyberType=", this.f23186a, ", viewType=", ", sportsId=", this.b), this.c, Separators.RPAREN);
    }
}
