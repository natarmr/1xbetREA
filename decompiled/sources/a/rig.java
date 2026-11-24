package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30541a;

    public rig(String str) {
        str.getClass();
        this.f30541a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rig) && Intrinsics.d(this.f30541a, ((rig) obj).f30541a);
    }

    public final int hashCode() {
        return this.f30541a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f30541a, Separators.RPAREN);
    }
}
