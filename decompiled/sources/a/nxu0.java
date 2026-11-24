package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class nxu0 implements sxu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f24300a;

    public nxu0(d7a d7aVar) {
        d7aVar.getClass();
        this.f24300a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxu0) && Intrinsics.d(this.f24300a, ((nxu0) obj).f24300a);
    }

    public final int hashCode() {
        return this.f24300a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptchaDialog(captcha=", this.f24300a, Separators.RPAREN);
    }
}
