package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nwi0 implements hej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24236a;
    public final String b;
    public final boolean c;
    public final g9 d;

    public nwi0(int i, String str, boolean z, g9 g9Var) {
        str.getClass();
        this.f24236a = i;
        this.b = str;
        this.c = z;
        this.d = g9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwi0)) {
            return false;
        }
        nwi0 nwi0Var = (nwi0) obj;
        return this.f24236a == nwi0Var.f24236a && Intrinsics.d(this.b, nwi0Var.b) && this.c == nwi0Var.c && this.d == nwi0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(ua80.b(Integer.hashCode(this.f24236a) * 31, 31, this.b), 31, this.c);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f24236a, "SettingsAccordionCellUiModel(image=", ", title=", this.b, ", expanded=");
        sbR.append(this.c);
        sbR.append(", group=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
