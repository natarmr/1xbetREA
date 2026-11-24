package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vz30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38281a;
    public final String b;
    public final List c;

    public vz30(String str, List list, int i) {
        list.getClass();
        this.f38281a = i;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz30)) {
            return false;
        }
        vz30 vz30Var = (vz30) obj;
        return this.f38281a == vz30Var.f38281a && this.b.equals(vz30Var.b) && Intrinsics.d(this.c, vz30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f38281a) * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(vqd.r(this.f38281a, "MenuModel(type=", ", name=", this.b, ", selectors="), this.c, Separators.RPAREN);
    }
}
