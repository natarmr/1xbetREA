package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e9v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7443a;
    public final boolean b;
    public final List c;
    public final int d;

    public e9v0(boolean z, boolean z2, List list, int i) {
        list.getClass();
        this.f7443a = z;
        this.b = z2;
        this.c = list;
        this.d = i;
    }

    public static e9v0 a(e9v0 e9v0Var, boolean z, boolean z2, List list, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = e9v0Var.f7443a;
        }
        if ((i2 & 2) != 0) {
            z2 = e9v0Var.b;
        }
        if ((i2 & 4) != 0) {
            list = e9v0Var.c;
        }
        if ((i2 & 8) != 0) {
            i = e9v0Var.d;
        }
        e9v0Var.getClass();
        list.getClass();
        return new e9v0(z, z2, list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9v0)) {
            return false;
        }
        e9v0 e9v0Var = (e9v0) obj;
        return this.f7443a == e9v0Var.f7443a && this.b == e9v0Var.b && Intrinsics.d(this.c, e9v0Var.c) && this.d == e9v0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + dw9.a(brm0.e(Boolean.hashCode(this.f7443a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("WelcomeBonusState(isLoading=", ", hasBets=", ", bonusesList=", this.f7443a, this.b);
        sbQ.append(this.c);
        sbQ.append(", selectedBonusId=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
