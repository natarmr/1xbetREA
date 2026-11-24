package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ldh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hdh0 f19851a;
    public final int b;
    public final List c;

    public ldh0(hdh0 hdh0Var, int i, List list) {
        list.getClass();
        this.f19851a = hdh0Var;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldh0)) {
            return false;
        }
        ldh0 ldh0Var = (ldh0) obj;
        return this.f19851a == ldh0Var.f19851a && this.b == ldh0Var.b && Intrinsics.d(this.c, ldh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f19851a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeaBattleShipModel(orientation=");
        sb.append(this.f19851a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", coordinates=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
