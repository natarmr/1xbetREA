package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sxo implements vxo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32986a;

    public sxo(String str) {
        str.getClass();
        this.f32986a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxo) && Intrinsics.d(this.f32986a, ((sxo) obj).f32986a);
    }

    public final int hashCode() {
        return this.f32986a.hashCode();
    }

    public final String toString() {
        return kng0.l("EnterOldPass(value=", this.f32986a, Separators.RPAREN);
    }
}
