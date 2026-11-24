package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class upk0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36070a;
    public final String b;
    public final gy30 c;

    public upk0(int i, String str, gy30 gy30Var) {
        str.getClass();
        this.f36070a = i;
        this.b = str;
        this.c = gy30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upk0)) {
            return false;
        }
        upk0 upk0Var = (upk0) obj;
        return this.f36070a == upk0Var.f36070a && Intrinsics.d(this.b, upk0Var.b) && this.c.equals(upk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f36070a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f36070a, "SpecialEventMenuUiItem(id=", ", title=", this.b, ", style=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
