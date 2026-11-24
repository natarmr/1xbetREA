package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ttu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final utu0 f34524a;
    public final String b;
    public final List c;

    public ttu0(utu0 utu0Var, String str, List list) {
        list.getClass();
        this.f34524a = utu0Var;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttu0)) {
            return false;
        }
        ttu0 ttu0Var = (ttu0) obj;
        return this.f34524a == ttu0Var.f34524a && this.b.equals(ttu0Var.b) && Intrinsics.d(this.c, ttu0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f34524a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VirtualSportRulesSectionModel(type=");
        sb.append(this.f34524a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", descriptionList=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
