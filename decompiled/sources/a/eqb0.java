package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class eqb0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8230a;
    public final long b;
    public final boolean c;

    public eqb0(long j, List list, boolean z) {
        list.getClass();
        this.f8230a = list;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqb0)) {
            return false;
        }
        eqb0 eqb0Var = (eqb0) obj;
        return Intrinsics.d(this.f8230a, eqb0Var.f8230a) && this.b == eqb0Var.b && this.c == eqb0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(this.f8230a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PowerOfPowerModel(heroTable=");
        sb.append(this.f8230a);
        sb.append(", timeSec=");
        sb.append(this.b);
        return f140.n(sb, ", timeIncrease=", this.c, Separators.RPAREN);
    }
}
