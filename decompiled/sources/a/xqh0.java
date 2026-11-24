package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xqh0 implements yqh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f41320a;

    public xqh0(d7a d7aVar) {
        d7aVar.getClass();
        this.f41320a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xqh0) && Intrinsics.d(this.f41320a, ((xqh0) obj).f41320a);
    }

    public final int hashCode() {
        return this.f41320a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptchaDialog(captchaResult=", this.f41320a, Separators.RPAREN);
    }
}
