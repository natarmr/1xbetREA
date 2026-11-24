package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mbo implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2n f21519a;
    public final boolean b;
    public final boolean c;

    public mbo(a2n a2nVar, boolean z, boolean z2) {
        a2nVar.getClass();
        this.f21519a = a2nVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbo)) {
            return false;
        }
        mbo mboVar = (mbo) obj;
        return Intrinsics.d(this.f21519a, mboVar.f21519a) && this.b == mboVar.b && this.c == mboVar.c;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f21519a.getKey();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f21519a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventCardUiItem(model=");
        sb.append(this.f21519a);
        sb.append(", startMargin=");
        sb.append(this.b);
        sb.append(", endMargin=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
