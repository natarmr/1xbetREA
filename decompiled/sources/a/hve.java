package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hve implements ive {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f13723a;
    public final zxj0 b;
    public final m9s c;
    public final ms2 d;

    public hve(m0k0 m0k0Var, zxj0 zxj0Var, m9s m9sVar, ms2 ms2Var) {
        m9sVar.getClass();
        ms2Var.getClass();
        this.f13723a = m0k0Var;
        this.b = zxj0Var;
        this.c = m9sVar;
        this.d = ms2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hve)) {
            return false;
        }
        hve hveVar = (hve) obj;
        return this.f13723a.equals(hveVar.f13723a) && this.b.equals(hveVar.b) && Intrinsics.d(this.c, hveVar.c) && Intrinsics.d(this.d, hveVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f13723a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OnReplaceCouponEvent(singleBetGame=" + this.f13723a + ", simpleBetZip=" + this.b + ", gameDetails=" + this.c + ", entryPoint=" + this.d + Separators.RPAREN;
    }
}
