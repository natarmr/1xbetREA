package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qxe0 implements zxe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f29481a;

    public qxe0(d7a d7aVar) {
        d7aVar.getClass();
        this.f29481a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxe0) && Intrinsics.d(this.f29481a, ((qxe0) obj).f29481a);
    }

    public final int hashCode() {
        return this.f29481a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptcha(userActionRequired=", this.f29481a, Separators.RPAREN);
    }
}
