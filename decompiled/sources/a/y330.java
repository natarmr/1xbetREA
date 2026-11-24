package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y330 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41932a;
    public final udl0 b;
    public final aw20 c;
    public final aw20 d;
    public final List e;
    public final boolean f;
    public final boolean g;

    public y330(boolean z, udl0 udl0Var, aw20 aw20Var, aw20 aw20Var2, List list, boolean z2, boolean z3) {
        list.getClass();
        this.f41932a = z;
        this.b = udl0Var;
        this.c = aw20Var;
        this.d = aw20Var2;
        this.e = list;
        this.f = z2;
        this.g = z3;
    }

    public static y330 a(y330 y330Var, boolean z, aw20 aw20Var, aw20 aw20Var2, List list, int i) {
        if ((i & 1) != 0) {
            z = y330Var.f41932a;
        }
        boolean z2 = z;
        udl0 udl0Var = y330Var.b;
        if ((i & 4) != 0) {
            aw20Var = y330Var.c;
        }
        aw20 aw20Var3 = aw20Var;
        if ((i & 8) != 0) {
            aw20Var2 = y330Var.d;
        }
        aw20 aw20Var4 = aw20Var2;
        if ((i & 16) != 0) {
            list = y330Var.e;
        }
        List list2 = list;
        boolean z3 = y330Var.f;
        boolean z4 = y330Var.g;
        y330Var.getClass();
        aw20Var3.getClass();
        aw20Var4.getClass();
        list2.getClass();
        return new y330(z2, udl0Var, aw20Var3, aw20Var4, list2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y330)) {
            return false;
        }
        y330 y330Var = (y330) obj;
        return this.f41932a == y330Var.f41932a && this.b == y330Var.b && this.c.equals(y330Var.c) && this.d.equals(y330Var.d) && Intrinsics.d(this.e, y330Var.e) && this.f == y330Var.f && this.g == y330Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e(dw9.a((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f41932a) * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketsDisplaySettingsState(isSettingsControlVisible=");
        sb.append(this.f41932a);
        sb.append(", sportGameType=");
        sb.append(this.b);
        sb.append(", marketPropertiesModel=");
        sb.append(this.c);
        sb.append(", savedMarketPropertiesModel=");
        sb.append(this.d);
        sb.append(", marketGroupModels=");
        rz4.z(sb, ", rtlSupport=", this.e, ", isClassicRefactorEnabled=", this.f);
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
