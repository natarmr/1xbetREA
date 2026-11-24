package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dje0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6182a;
    public final boolean b;
    public final List c;

    public dje0(List list, boolean z, boolean z2) {
        list.getClass();
        this.f6182a = z;
        this.b = z2;
        this.c = list;
    }

    public static dje0 a(dje0 dje0Var, boolean z, boolean z2) {
        List list = dje0Var.c;
        list.getClass();
        return new dje0(list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dje0)) {
            return false;
        }
        dje0 dje0Var = (dje0) obj;
        return this.f6182a == dje0Var.f6182a && this.b == dje0Var.b && Intrinsics.d(this.c, dje0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(brm0.e(Boolean.hashCode(this.f6182a) * 31, 31, this.b), 31, false);
    }

    public final String toString() {
        return dw9.r(f140.q("RefereeLastGameState(isLoading=", ", isError=", ", isEmpty=false, gamesResultList=", this.f6182a, this.b), this.c, Separators.RPAREN);
    }
}
