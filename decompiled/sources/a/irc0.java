package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class irc0 implements jrc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final shc0 f15251a;
    public final muc0 b;

    public irc0(shc0 shc0Var, muc0 muc0Var) {
        shc0Var.getClass();
        this.f15251a = shc0Var;
        this.b = muc0Var;
    }

    @Override // a.jrc0
    public final shc0 a() {
        return this.f15251a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irc0)) {
            return false;
        }
        irc0 irc0Var = (irc0) obj;
        return Intrinsics.d(this.f15251a, irc0Var.f15251a) && this.b.equals(irc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15251a.hashCode() * 31);
    }

    public final String toString() {
        return "Shimmer(toolbarUiModel=" + this.f15251a + ", promoStoreCollectionShimmer=" + this.b + Separators.RPAREN;
    }
}
