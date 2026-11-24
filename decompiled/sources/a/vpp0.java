package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vpp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f37816a;
    public final List b;

    public vpp0(btk0 btk0Var, List list) {
        list.getClass();
        this.f37816a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpp0)) {
            return false;
        }
        vpp0 vpp0Var = (vpp0) obj;
        return this.f37816a.equals(vpp0Var.f37816a) && Intrinsics.d(this.b, vpp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37816a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("TeamsLineGamesStateModel(contentStatus=", this.f37816a, ", content=", this.b, Separators.RPAREN);
    }
}
