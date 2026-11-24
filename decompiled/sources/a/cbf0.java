package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cbf0 implements lbf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f4060a;

    public cbf0(d7a d7aVar) {
        d7aVar.getClass();
        this.f4060a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbf0) && Intrinsics.d(this.f4060a, ((cbf0) obj).f4060a);
    }

    public final int hashCode() {
        return this.f4060a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptcha(userActionRequired=", this.f4060a, Separators.RPAREN);
    }
}
