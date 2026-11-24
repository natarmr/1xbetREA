package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class adk0 implements bdk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f684a;

    public adk0(d7a d7aVar) {
        d7aVar.getClass();
        this.f684a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof adk0) && Intrinsics.d(this.f684a, ((adk0) obj).f684a);
    }

    public final int hashCode() {
        return this.f684a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptchaDialog(captcha=", this.f684a, Separators.RPAREN);
    }
}
