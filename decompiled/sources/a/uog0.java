package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uog0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36013a;
    public final int b;
    public final int c;

    public uog0(String str, int i, int i2) {
        str.getClass();
        this.f36013a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uog0)) {
            return false;
        }
        uog0 uog0Var = (uog0) obj;
        return Intrinsics.d(this.f36013a, uog0Var.f36013a) && this.b == uog0Var.b && this.c == uog0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f36013a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, kng0.p(this.b, "RussianLottoBiletItemParamsUiModel(title=", this.f36013a, ", titleColor=", ", background="));
    }
}
