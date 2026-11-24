package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class iej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14636a;
    public final boolean b;
    public final List c;

    public iej0(List list, boolean z, boolean z2) {
        list.getClass();
        this.f14636a = z;
        this.b = z2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iej0)) {
            return false;
        }
        iej0 iej0Var = (iej0) obj;
        return this.f14636a == iej0Var.f14636a && this.b == iej0Var.b && Intrinsics.d(this.c, iej0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f14636a) * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(f140.q("SettingsUiState(showLoader=", ", scrollToTop=", ", settingsUiModelList=", this.f14636a, this.b), this.c, Separators.RPAREN);
    }
}
