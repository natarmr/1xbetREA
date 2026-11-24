package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eve implements ive {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dao f8463a;
    public final m9s b;

    static {
        int i = dao.t;
    }

    public eve(dao daoVar, m9s m9sVar) {
        daoVar.getClass();
        m9sVar.getClass();
        this.f8463a = daoVar;
        this.b = m9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eve)) {
            return false;
        }
        eve eveVar = (eve) obj;
        return Intrinsics.d(this.f8463a, eveVar.f8463a) && Intrinsics.d(this.b, eveVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8463a.hashCode() * 31);
    }

    public final String toString() {
        return "OnConfirmAddToEditCoupon(eventBet=" + this.f8463a + ", gameDetails=" + this.b + Separators.RPAREN;
    }
}
