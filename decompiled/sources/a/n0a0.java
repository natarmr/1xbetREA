package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n0a0 implements p0a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22691a;

    public n0a0(String str) {
        str.getClass();
        this.f22691a = str;
    }

    @Override // a.p0a0
    public final String a() {
        return this.f22691a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0a0) && Intrinsics.d(this.f22691a, ((n0a0) obj).f22691a);
    }

    public final int hashCode() {
        return this.f22691a.hashCode();
    }

    public final String toString() {
        return kng0.l("Loading(screenTitle=", this.f22691a, Separators.RPAREN);
    }
}
