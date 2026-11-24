package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mnn implements nnn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hxu f22097a;
    public final String b;

    public mnn(hxu hxuVar, String str) {
        hxuVar.getClass();
        str.getClass();
        this.f22097a = hxuVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnn)) {
            return false;
        }
        mnn mnnVar = (mnn) obj;
        return Intrinsics.d(this.f22097a, mnnVar.f22097a) && Intrinsics.d(this.b, mnnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22097a.hashCode() * 31);
    }

    public final String toString() {
        return "Tax(getTaxModel=" + this.f22097a + ", currencySymbol=" + this.b + Separators.RPAREN;
    }
}
