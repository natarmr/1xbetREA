package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g0e implements q0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f10454a;

    public g0e(d7a d7aVar) {
        d7aVar.getClass();
        this.f10454a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0e) && Intrinsics.d(this.f10454a, ((g0e) obj).f10454a);
    }

    public final int hashCode() {
        return this.f10454a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptcha(captchaResult=", this.f10454a, Separators.RPAREN);
    }
}
