package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q650 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t650 f28185a;
    public final String b;

    public q650(t650 t650Var, String str) {
        t650Var.getClass();
        this.f28185a = t650Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q650)) {
            return false;
        }
        q650 q650Var = (q650) obj;
        return Intrinsics.d(this.f28185a, q650Var.f28185a) && this.b.equals(q650Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28185a.hashCode() * 31);
    }

    public final String toString() {
        return "MyAggregatorTipModel(screen=" + this.f28185a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
