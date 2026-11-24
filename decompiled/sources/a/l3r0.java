package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l3r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19373a;
    public final h3r0 b;

    public l3r0(List list, h3r0 h3r0Var) {
        list.getClass();
        this.f19373a = list;
        this.b = h3r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3r0)) {
            return false;
        }
        l3r0 l3r0Var = (l3r0) obj;
        return Intrinsics.d(this.f19373a, l3r0Var.f19373a) && this.b.equals(l3r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19373a.hashCode() * 31);
    }

    public final String toString() {
        return "TopEventPlayersModel(players=" + this.f19373a + ", model=" + this.b + Separators.RPAREN;
    }
}
