package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z6c implements h7c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f43859a;

    public z6c(d7a d7aVar) {
        d7aVar.getClass();
        this.f43859a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z6c) && Intrinsics.d(this.f43859a, ((z6c) obj).f43859a);
    }

    public final int hashCode() {
        return this.f43859a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptcha(captchaResult=", this.f43859a, Separators.RPAREN);
    }
}
