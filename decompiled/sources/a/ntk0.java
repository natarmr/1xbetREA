package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ntk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f24105a;
    public final List b;

    public ntk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f24105a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntk0)) {
            return false;
        }
        ntk0 ntk0Var = (ntk0) obj;
        return this.f24105a.equals(ntk0Var.f24105a) && Intrinsics.d(this.b, ntk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24105a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("SpecialEventTabMapStatisticStateModel(contentStatus=", this.f24105a, ", content=", this.b, Separators.RPAREN);
    }
}
