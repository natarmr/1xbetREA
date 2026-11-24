package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mxf0 implements pxf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f22553a;

    public mxf0(d7a d7aVar) {
        d7aVar.getClass();
        this.f22553a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mxf0) && Intrinsics.d(this.f22553a, ((mxf0) obj).f22553a);
    }

    public final int hashCode() {
        return this.f22553a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptcha(userActionRequired=", this.f22553a, Separators.RPAREN);
    }
}
