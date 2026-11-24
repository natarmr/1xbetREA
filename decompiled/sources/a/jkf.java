package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jkf implements nkf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16666a;

    public final boolean equals(Object obj) {
        if (obj instanceof jkf) {
            return Intrinsics.d(this.f16666a, ((jkf) obj).f16666a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16666a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSelectCompositionPlayer(value=", this.f16666a, Separators.RPAREN);
    }
}
