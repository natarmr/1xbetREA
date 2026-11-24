package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class iir extends mir {
    public static final hir Companion = new hir();
    public final boolean c;
    public final int d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iir(int i, int i2, String str, String str2, boolean z) {
        super(i, str);
        if (6 != (i & 6)) {
            m2x.I(i, 6, gir.f11363a.getDescriptor());
            throw null;
        }
        this.c = z;
        this.d = i2;
        if ((i & 8) == 0) {
            this.e = "GPWebAppSwitchKeyboard";
        } else {
            this.e = str2;
        }
    }

    @Override // a.mir
    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iir)) {
            return false;
        }
        iir iirVar = (iir) obj;
        return this.c == iirVar.c && this.d == iirVar.d && Intrinsics.d(this.e, iirVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, Boolean.hashCode(this.c) * 31, 31);
    }

    public final String toString() {
        return axq.n(ohs0.t(this.d, "GPWebAppSwitchKeyboard(visible=", ", height=", ", eventName=", this.c), this.e, Separators.RPAREN);
    }

    public iir(boolean z, int i) {
        this.c = z;
        this.d = i;
        this.e = "GPWebAppSwitchKeyboard";
    }
}
