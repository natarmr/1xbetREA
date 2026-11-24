package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35281a;
    public final boolean b;
    public final String c;

    public u9f0(String str, boolean z, boolean z2) {
        str.getClass();
        this.f35281a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9f0)) {
            return false;
        }
        u9f0 u9f0Var = (u9f0) obj;
        return this.f35281a == u9f0Var.f35281a && this.b == u9f0Var.b && Intrinsics.d(this.c, u9f0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f35281a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(f140.q("RegistrationVisualBottomBarUiModel(isRegistrationButtonEnable=", ", isVisible=", ", buttonText=", this.f35281a, this.b), this.c, Separators.RPAREN);
    }
}
