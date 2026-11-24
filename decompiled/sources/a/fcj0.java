package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fcj0 implements scj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f9315a;

    public fcj0(d7a d7aVar) {
        d7aVar.getClass();
        this.f9315a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fcj0) && Intrinsics.d(this.f9315a, ((fcj0) obj).f9315a);
    }

    public final int hashCode() {
        return this.f9315a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptcha(userActionRequired=", this.f9315a, Separators.RPAREN);
    }
}
