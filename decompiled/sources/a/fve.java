package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fve implements ive {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dao f10210a;
    public final m9s b;

    static {
        int i = dao.t;
    }

    public fve(dao daoVar, m9s m9sVar) {
        m9sVar.getClass();
        this.f10210a = daoVar;
        this.b = m9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fve)) {
            return false;
        }
        fve fveVar = (fve) obj;
        return this.f10210a.equals(fveVar.f10210a) && Intrinsics.d(this.b, fveVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10210a.hashCode() * 31);
    }

    public final String toString() {
        return "OnEditCouponBetClick(eventBet=" + this.f10210a + ", gameDetails=" + this.b + Separators.RPAREN;
    }
}
