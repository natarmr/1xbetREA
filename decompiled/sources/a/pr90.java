package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pr90 implements rr90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6q0 f27454a;
    public final wul b;

    public pr90(c6q0 c6q0Var, wul wulVar) {
        c6q0Var.getClass();
        this.f27454a = c6q0Var;
        this.b = wulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr90)) {
            return false;
        }
        pr90 pr90Var = (pr90) obj;
        return Intrinsics.d(this.f27454a, pr90Var.f27454a) && this.b.equals(pr90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27454a.hashCode() * 31);
    }

    public final String toString() {
        return "EnterPhoneCode(textFieldBasicUiModel=" + this.f27454a + ", buttonUiModel=" + this.b + Separators.RPAREN;
    }
}
