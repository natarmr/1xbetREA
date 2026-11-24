package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qd5 implements ud5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f28518a;
    public final xyw b;

    public qd5(Integer num, xyw xywVar) {
        this.f28518a = num;
        this.b = xywVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd5)) {
            return false;
        }
        qd5 qd5Var = (qd5) obj;
        return Intrinsics.d(this.f28518a, qd5Var.f28518a) && this.b.equals(qd5Var.b);
    }

    public final int hashCode() {
        Integer num = this.f28518a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "Lottie(lottieRes=" + this.f28518a + ", imageBackgroundType=" + this.b + Separators.RPAREN;
    }
}
