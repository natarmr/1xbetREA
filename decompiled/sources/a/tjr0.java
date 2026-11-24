package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tjr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34063a;
    public final lmr0 b;
    public final int c;

    public tjr0(boolean z, lmr0 lmr0Var, int i) {
        lmr0Var.getClass();
        this.f34063a = z;
        this.b = lmr0Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjr0)) {
            return false;
        }
        tjr0 tjr0Var = (tjr0) obj;
        return this.f34063a == tjr0Var.f34063a && Intrinsics.d(this.b, tjr0Var.b) && this.c == tjr0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.f34063a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoBetGameInfoState(isLightTheme=");
        sb.append(this.f34063a);
        sb.append(", totoBetTypeModel=");
        sb.append(this.b);
        sb.append(", chosenOutcomesCount=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
