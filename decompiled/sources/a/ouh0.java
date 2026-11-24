package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ouh0 implements puh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f25877a;

    public ouh0(d7a d7aVar) {
        d7aVar.getClass();
        this.f25877a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ouh0) && Intrinsics.d(this.f25877a, ((ouh0) obj).f25877a);
    }

    public final int hashCode() {
        return this.f25877a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptchaDialog(captchaResult=", this.f25877a, Separators.RPAREN);
    }
}
