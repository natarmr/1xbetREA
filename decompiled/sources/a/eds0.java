package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eds0 implements gds0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7633a;
    public final Throwable b;

    public eds0(Throwable th, List list) {
        list.getClass();
        this.f7633a = list;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eds0)) {
            return false;
        }
        eds0 eds0Var = (eds0) obj;
        return Intrinsics.d(this.f7633a, eds0Var.f7633a) && Intrinsics.d(this.b, eds0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f7633a.hashCode() * 31;
        Throwable th = this.b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "Recommended(games=" + this.f7633a + ", afterFavoritesError=" + this.b + Separators.RPAREN;
    }
}
