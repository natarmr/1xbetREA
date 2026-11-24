package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class pvo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27672a;
    public final String b;

    public pvo0(String str, boolean z) {
        str.getClass();
        this.f27672a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvo0)) {
            return false;
        }
        pvo0 pvo0Var = (pvo0) obj;
        return this.f27672a == pvo0Var.f27672a && Intrinsics.d(this.b, pvo0Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(R.color.static_white_80) + twn.a(R.color.static_white_20, twn.a(R.color.static_white, twn.a(R.color.static_black_70, ua80.b(Boolean.hashCode(this.f27672a) * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("TaxMessageUiModel(visible=", ", text=", this.b, this.f27672a, ", bgColorRes=");
        axq.r(R.color.static_black_70, R.color.static_white, ", iconColorRes=", ", iconBgColorRes=", sbQ);
        return w6x.o(R.color.static_white_20, R.color.static_white_80, ", textColorRes=", Separators.RPAREN, sbQ);
    }
}
