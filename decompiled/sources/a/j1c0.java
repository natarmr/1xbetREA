package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j1c0 implements o1c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f15727a;

    public j1c0(d7a d7aVar) {
        d7aVar.getClass();
        this.f15727a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1c0) && Intrinsics.d(this.f15727a, ((j1c0) obj).f15727a);
    }

    public final int hashCode() {
        return this.f15727a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptcha(userActionRequired=", this.f15727a, Separators.RPAREN);
    }
}
