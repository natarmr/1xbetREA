package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mj2 implements nj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f21873a;
    public final Throwable b;

    public mj2(ArrayList arrayList, Throwable th) {
        this.f21873a = arrayList;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj2)) {
            return false;
        }
        mj2 mj2Var = (mj2) obj;
        return this.f21873a.equals(mj2Var.f21873a) && Intrinsics.d(this.b, mj2Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f21873a.hashCode() * 31;
        Throwable th = this.b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "Recommended(items=" + this.f21873a + ", afterFavoritesError=" + this.b + Separators.RPAREN;
    }
}
