package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cxq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5135a;
    public final h3r0 b;

    public cxq0(List list, h3r0 h3r0Var) {
        list.getClass();
        this.f5135a = list;
        this.b = h3r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxq0)) {
            return false;
        }
        cxq0 cxq0Var = (cxq0) obj;
        return Intrinsics.d(this.f5135a, cxq0Var.f5135a) && this.b.equals(cxq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5135a.hashCode() * 31);
    }

    public final String toString() {
        return "Top10PlayersModel(players=" + this.f5135a + ", model=" + this.b + Separators.RPAREN;
    }
}
