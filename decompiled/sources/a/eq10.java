package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class eq10 implements gq10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f8213a;

    public eq10(d7a d7aVar) {
        d7aVar.getClass();
        this.f8213a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq10) && Intrinsics.d(this.f8213a, ((eq10) obj).f8213a);
    }

    public final int hashCode() {
        return this.f8213a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptcha(captchaResult=", this.f8213a, Separators.RPAREN);
    }
}
