package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x0i0 implements b1i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f40071a;

    public x0i0(d7a d7aVar) {
        d7aVar.getClass();
        this.f40071a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0i0) && Intrinsics.d(this.f40071a, ((x0i0) obj).f40071a);
    }

    public final int hashCode() {
        return this.f40071a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptcha(captchaResult=", this.f40071a, Separators.RPAREN);
    }
}
