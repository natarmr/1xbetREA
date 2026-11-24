package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kcq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18072a;
    public final List b;
    public final gcq c;
    public final boolean d;

    public kcq(float f, List list, gcq gcqVar, boolean z) {
        list.getClass();
        this.f18072a = f;
        this.b = list;
        this.c = gcqVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcq)) {
            return false;
        }
        kcq kcqVar = (kcq) obj;
        return Float.compare(this.f18072a, kcqVar.f18072a) == 0 && Intrinsics.d(this.b, kcqVar.b) && this.c.equals(kcqVar.c) && this.d == kcqVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + dw9.a(Float.hashCode(this.f18072a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "FinanceObjectModel(currentPrice=" + this.f18072a + ", events=" + this.b + ", instrument=" + this.c + ", betSuspended=" + this.d + Separators.RPAREN;
    }
}
