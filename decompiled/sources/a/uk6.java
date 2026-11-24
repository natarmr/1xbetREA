package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class uk6 {
    public static final tk6 Companion = new tk6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f35811a;
    public final Boolean b;

    public /* synthetic */ uk6(int i, Integer num, Boolean bool) {
        if ((i & 1) == 0) {
            this.f35811a = null;
        } else {
            this.f35811a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk6)) {
            return false;
        }
        uk6 uk6Var = (uk6) obj;
        return Intrinsics.d(this.f35811a, uk6Var.f35811a) && Intrinsics.d(this.b, uk6Var.b);
    }

    public final int hashCode() {
        Integer num = this.f35811a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BetBuilderPenaltyShotResponse(id=" + this.f35811a + ", isScored=" + this.b + Separators.RPAREN;
    }
}
