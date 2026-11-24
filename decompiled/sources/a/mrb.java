package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mrb implements orb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22261a;

    public final boolean equals(Object obj) {
        if (obj instanceof mrb) {
            return Intrinsics.d(this.f22261a, ((mrb) obj).f22261a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22261a.hashCode();
    }

    public final String toString() {
        return kng0.l("ChangeInputOldPass(value=", this.f22261a, Separators.RPAREN);
    }
}
