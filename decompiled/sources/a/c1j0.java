package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c1j0 implements o1j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f3574a;

    public c1j0(d7a d7aVar) {
        d7aVar.getClass();
        this.f3574a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1j0) && Intrinsics.d(this.f3574a, ((c1j0) obj).f3574a);
    }

    public final int hashCode() {
        return this.f3574a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptcha(userActionRequired=", this.f3574a, Separators.RPAREN);
    }
}
