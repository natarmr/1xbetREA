package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44560a;
    public final ih2 b;

    public zl2(List list, ih2 ih2Var) {
        list.getClass();
        this.f44560a = list;
        this.b = ih2Var;
    }

    public static zl2 a(zl2 zl2Var, List list, ih2 ih2Var, int i) {
        if ((i & 1) != 0) {
            list = zl2Var.f44560a;
        }
        if ((i & 2) != 0) {
            ih2Var = zl2Var.b;
        }
        zl2Var.getClass();
        list.getClass();
        return new zl2(list, ih2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2)) {
            return false;
        }
        zl2 zl2Var = (zl2) obj;
        return Intrinsics.d(this.f44560a, zl2Var.f44560a) && this.b == zl2Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44560a.hashCode() * 31);
    }

    public final String toString() {
        return "AltSportsContainerState(altSportTabsList=" + this.f44560a + ", altSportTab=" + this.b + Separators.RPAREN;
    }
}
