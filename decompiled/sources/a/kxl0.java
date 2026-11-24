package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class kxl0 {
    public static final hxl0 Companion = new hxl0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mwl0 f19061a;

    static {
        gwl0 gwl0Var = mwl0.Companion;
    }

    public /* synthetic */ kxl0(int i, mwl0 mwl0Var) {
        if ((i & 1) == 0) {
            this.f19061a = null;
        } else {
            this.f19061a = mwl0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxl0) && Intrinsics.d(this.f19061a, ((kxl0) obj).f19061a);
    }

    public final int hashCode() {
        mwl0 mwl0Var = this.f19061a;
        if (mwl0Var == null) {
            return 0;
        }
        return mwl0Var.hashCode();
    }

    public final String toString() {
        return "StadiumResponse(stadiumInfo=" + this.f19061a + Separators.RPAREN;
    }
}
