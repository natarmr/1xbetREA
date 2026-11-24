package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kci0 implements tci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18062a;
    public final d7a b;

    public kci0(d7a d7aVar, String str) {
        str.getClass();
        d7aVar.getClass();
        this.f18062a = str;
        this.b = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kci0)) {
            return false;
        }
        kci0 kci0Var = (kci0) obj;
        return Intrinsics.d(this.f18062a, kci0Var.f18062a) && Intrinsics.d(this.b, kci0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18062a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowCaptcha(captchaDialogTitle=" + this.f18062a + ", captchaResult=" + this.b + Separators.RPAREN;
    }
}
