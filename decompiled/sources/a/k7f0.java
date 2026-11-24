package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k7f0 implements n7f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f17816a;

    public k7f0(d7a d7aVar) {
        d7aVar.getClass();
        this.f17816a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7f0) && Intrinsics.d(this.f17816a, ((k7f0) obj).f17816a);
    }

    public final int hashCode() {
        return this.f17816a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptcha(userActionRequired=", this.f17816a, Separators.RPAREN);
    }
}
