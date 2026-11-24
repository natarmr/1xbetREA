package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class mob0 implements Serializable {
    public static final mob0 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22128a;
    public final double b;
    public final double c;
    public final List d;
    public final List e;

    static {
        iun iunVar = iun.f15405a;
        f = new mob0(-1, 0.0d, 0.0d, iunVar, iunVar);
    }

    public mob0(int i, double d, double d2, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f22128a = i;
        this.b = d;
        this.c = d2;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mob0)) {
            return false;
        }
        mob0 mob0Var = (mob0) obj;
        return this.f22128a == mob0Var.f22128a && Double.compare(this.b, mob0Var.b) == 0 && Double.compare(this.c, mob0Var.c) == 0 && Intrinsics.d(this.d, mob0Var.d) && Intrinsics.d(this.e, mob0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(brm0.d(this.c, brm0.d(this.b, Integer.hashCode(this.f22128a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PowerBetModel(type=");
        sb.append(this.f22128a);
        sb.append(", param=");
        sb.append(this.b);
        ohs0.A(sb, this.c, ", sum=", ", params=");
        return kng0.n(", playerNames=", Separators.RPAREN, sb, this.d, this.e);
    }
}
