package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eqp0 implements fqp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8248a;
    public final Throwable b;

    public eqp0(Throwable th, List list) {
        list.getClass();
        this.f8248a = list;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqp0)) {
            return false;
        }
        eqp0 eqp0Var = (eqp0) obj;
        return Intrinsics.d(this.f8248a, eqp0Var.f8248a) && Intrinsics.d(this.b, eqp0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f8248a.hashCode() * 31;
        Throwable th = this.b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "Recommended(items=" + this.f8248a + ", afterFavoritesError=" + this.b + Separators.RPAREN;
    }
}
