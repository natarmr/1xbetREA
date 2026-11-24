package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ldr0 {
    public static final ldr0 d = new ldr0(0, 0, iun.f15405a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19865a;
    public final int b;
    public final List c;

    public ldr0(int i, int i2, List list) {
        list.getClass();
        this.f19865a = i;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldr0)) {
            return false;
        }
        ldr0 ldr0Var = (ldr0) obj;
        return this.f19865a == ldr0Var.f19865a && this.b == ldr0Var.b && Intrinsics.d(this.c, ldr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f19865a) * 31, 31);
    }

    public final String toString() {
        return dw9.r(dw9.t("TopRoundDescriptionModel(totalGames=", this.f19865a, ", drawCount=", ", topLineInformationList=", this.b), this.c, Separators.RPAREN);
    }
}
