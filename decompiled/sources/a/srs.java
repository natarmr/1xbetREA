package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class srs implements trs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32694a;

    public srs(String str) {
        str.getClass();
        this.f32694a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof srs) && Intrinsics.d(this.f32694a, ((srs) obj).f32694a);
    }

    public final int hashCode() {
        return this.f32694a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f32694a, Separators.RPAREN);
    }
}
