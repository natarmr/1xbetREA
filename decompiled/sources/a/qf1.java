package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vf1 f28607a;
    public final String b;

    public qf1(vf1 vf1Var, String str) {
        vf1Var.getClass();
        this.f28607a = vf1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf1)) {
            return false;
        }
        qf1 qf1Var = (qf1) obj;
        return Intrinsics.d(this.f28607a, qf1Var.f28607a) && this.b.equals(qf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28607a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorPromoTipModel(screen=" + this.f28607a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
