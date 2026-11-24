package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class uk60 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35812a;
    public final int b;
    public final int c;
    public final int d;

    public uk60(int i, int i2, int i3, String str) {
        str.getClass();
        this.f35812a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk60)) {
            return false;
        }
        uk60 uk60Var = (uk60) obj;
        return Intrinsics.d(this.f35812a, uk60Var.f35812a) && this.b == uk60Var.b && this.c == uk60Var.c && this.d == uk60Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.a(this.b, twn.a(R.drawable.onboarding_placeholder, this.f35812a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(R.drawable.onboarding_placeholder, "OnboardingUiModel(image=", this.f35812a, ", placeholder=", ", bannerBackground=");
        axq.r(this.b, this.c, ", title=", ", description=", sbP);
        return rz4.j(this.d, Separators.RPAREN, sbP);
    }
}
