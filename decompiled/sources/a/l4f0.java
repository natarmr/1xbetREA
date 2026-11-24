package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l4f0 implements t4f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f19402a;

    public l4f0(d7a d7aVar) {
        d7aVar.getClass();
        this.f19402a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4f0) && Intrinsics.d(this.f19402a, ((l4f0) obj).f19402a);
    }

    public final int hashCode() {
        return this.f19402a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptcha(userActionRequired=", this.f19402a, Separators.RPAREN);
    }
}
