package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class itl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wul f15358a;
    public final jtl b;

    public itl(wul wulVar, jtl jtlVar) {
        jtlVar.getClass();
        this.f15358a = wulVar;
        this.b = jtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itl)) {
            return false;
        }
        itl itlVar = (itl) obj;
        return this.f15358a.equals(itlVar.f15358a) && Intrinsics.d(this.b, itlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15358a.hashCode() * 31);
    }

    public final String toString() {
        return "DsBottomBarButtonModel(button=" + this.f15358a + ", buttonType=" + this.b + Separators.RPAREN;
    }
}
