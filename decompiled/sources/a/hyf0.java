package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hyf0 implements kyf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f13858a;

    public hyf0(d7a d7aVar) {
        d7aVar.getClass();
        this.f13858a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hyf0) && Intrinsics.d(this.f13858a, ((hyf0) obj).f13858a);
    }

    public final int hashCode() {
        return this.f13858a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptcha(userActionRequired=", this.f13858a, Separators.RPAREN);
    }
}
