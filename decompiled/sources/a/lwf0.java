package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lwf0 implements owf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20762a;
    public final swp0 b;

    public lwf0(swp0 swp0Var, List list) {
        list.getClass();
        this.f20762a = list;
        this.b = swp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwf0)) {
            return false;
        }
        lwf0 lwf0Var = (lwf0) obj;
        return Intrinsics.d(this.f20762a, lwf0Var.f20762a) && this.b.equals(lwf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20762a.hashCode() * 31);
    }

    public final String toString() {
        return "EmptyAccounts(ids=" + this.f20762a + ", temporaryToken=" + this.b + Separators.RPAREN;
    }
}
