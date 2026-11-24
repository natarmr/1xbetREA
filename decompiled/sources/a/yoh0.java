package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yoh0 implements zoh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f42986a;

    public yoh0(d7a d7aVar) {
        d7aVar.getClass();
        this.f42986a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yoh0) && Intrinsics.d(this.f42986a, ((yoh0) obj).f42986a);
    }

    public final int hashCode() {
        return this.f42986a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptchaDialog(captchaResult=", this.f42986a, Separators.RPAREN);
    }
}
