package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yec implements zec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1q0 f42479a;

    public final boolean equals(Object obj) {
        if (obj instanceof yec) {
            return Intrinsics.d(this.f42479a, ((yec) obj).f42479a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42479a.hashCode();
    }

    public final String toString() {
        return "SelectCreds(model=" + this.f42479a + Separators.RPAREN;
    }
}
