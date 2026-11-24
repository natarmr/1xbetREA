package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class arb implements erb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f1337a;

    public arb(d7a d7aVar) {
        d7aVar.getClass();
        this.f1337a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof arb) && Intrinsics.d(this.f1337a, ((arb) obj).f1337a);
    }

    public final int hashCode() {
        return this.f1337a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptcha(captchaResult=", this.f1337a, Separators.RPAREN);
    }
}
