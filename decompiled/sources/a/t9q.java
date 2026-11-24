package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t9q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f33579a;
    public final Integer b;

    public t9q(Integer num, List list) {
        list.getClass();
        this.f33579a = list;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9q)) {
            return false;
        }
        t9q t9qVar = (t9q) obj;
        return Intrinsics.d(this.f33579a, t9qVar.f33579a) && Intrinsics.d(this.b, t9qVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f33579a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "FinBetsInstrumentsDialogState(instruments=" + this.f33579a + ", selectedInstrumentId=" + this.b + Separators.RPAREN;
    }
}
