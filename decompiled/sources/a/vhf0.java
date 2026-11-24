package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vhf0 implements whf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37427a;
    public final au90 b;

    public vhf0(String str, au90 au90Var) {
        str.getClass();
        this.f37427a = str;
        this.b = au90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhf0)) {
            return false;
        }
        vhf0 vhf0Var = (vhf0) obj;
        return Intrinsics.d(this.f37427a, vhf0Var.f37427a) && this.b.equals(vhf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37427a.hashCode() * 31);
    }

    public final String toString() {
        return "PinCodeChanged(pin=" + this.f37427a + ", action=" + this.b + Separators.RPAREN;
    }
}
