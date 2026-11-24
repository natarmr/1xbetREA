package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class udt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ufp0 f35496a;
    public final t2m0 b;
    public final List c;

    public udt0(ufp0 ufp0Var, t2m0 t2m0Var, List list) {
        list.getClass();
        this.f35496a = ufp0Var;
        this.b = t2m0Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udt0)) {
            return false;
        }
        udt0 udt0Var = (udt0) obj;
        return this.f35496a.equals(udt0Var.f35496a) && this.b == udt0Var.b && Intrinsics.d(this.c, udt0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f35496a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalTableRowModel(teamModel=");
        sb.append(this.f35496a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", cellModelList=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
