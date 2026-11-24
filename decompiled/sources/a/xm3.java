package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xm3 implements zm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41102a;
    public final String b;
    public final boolean c;

    public xm3(String str, boolean z, boolean z2) {
        str.getClass();
        this.f41102a = z;
        this.b = str;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm3)) {
            return false;
        }
        xm3 xm3Var = (xm3) obj;
        return this.f41102a == xm3Var.f41102a && Intrinsics.d(this.b, xm3Var.b) && this.c == xm3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Boolean.hashCode(this.f41102a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(axq.q("Error(isBackButtonEnable=", ", textMessage=", this.b, this.f41102a, ", isUpdateBtnEnabled="), this.c, Separators.RPAREN);
    }
}
