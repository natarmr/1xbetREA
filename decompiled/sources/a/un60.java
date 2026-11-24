package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class un60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zn60 f35946a;
    public final boolean b;
    public final List c;

    public un60(zn60 zn60Var, boolean z, List list) {
        list.getClass();
        this.f35946a = zn60Var;
        this.b = z;
        this.c = list;
    }

    public static un60 a(un60 un60Var, zn60 zn60Var, boolean z, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            zn60Var = un60Var.f35946a;
        }
        if ((i & 2) != 0) {
            z = un60Var.b;
        }
        List list = arrayList;
        if ((i & 8) != 0) {
            list = un60Var.c;
        }
        list.getClass();
        return new un60(zn60Var, z, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un60)) {
            return false;
        }
        un60 un60Var = (un60) obj;
        return this.f35946a == un60Var.f35946a && this.b == un60Var.b && Intrinsics.d(this.c, un60Var.c);
    }

    public final int hashCode() {
        zn60 zn60Var = this.f35946a;
        return this.c.hashCode() + brm0.e(brm0.e((zn60Var == null ? 0 : zn60Var.hashCode()) * 31, 31, this.b), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneXGameDelegateState(screen=");
        sb.append(this.f35946a);
        sb.append(", showLoading=");
        sb.append(this.b);
        sb.append(", authorized=false, favoriteIds=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
