package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mqd implements f3u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f22219a;

    public mqd(Function1 function1) {
        this.f22219a = function1;
    }

    @Override // a.f3u0
    public final Object a(bh90 bh90Var) {
        return this.f22219a.invoke(bh90Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mqd) && Intrinsics.d(this.f22219a, ((mqd) obj).f22219a);
    }

    public final int hashCode() {
        return this.f22219a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f22219a + Separators.RPAREN;
    }
}
