package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u19 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34892a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final hr10 e;

    public u19(boolean z, boolean z2, boolean z3, List list, hr10 hr10Var) {
        hr10Var.getClass();
        this.f34892a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = hr10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u19)) {
            return false;
        }
        u19 u19Var = (u19) obj;
        return this.f34892a == u19Var.f34892a && this.b == u19Var.b && this.c == u19Var.c && Intrinsics.d(this.d, u19Var.d) && this.e == u19Var.e;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(Boolean.hashCode(this.f34892a) * 31, 31, this.b), 31, this.c);
        List list = this.d;
        return this.e.hashCode() + ((iE + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("BannersState(isLoading=", ", isInitialLoadFinished=", ", isError=", this.f34892a, this.b);
        vqd.y(sbQ, ", bannersList=", this.d, ", style=", this.c);
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
