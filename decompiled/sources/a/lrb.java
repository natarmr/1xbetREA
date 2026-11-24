package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lrb implements orb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20522a;

    public final boolean equals(Object obj) {
        if (obj instanceof lrb) {
            return Intrinsics.d(this.f20522a, ((lrb) obj).f20522a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20522a.hashCode();
    }

    public final String toString() {
        return kng0.l("ChangeInputNewPassConfirm(value=", this.f20522a, Separators.RPAREN);
    }
}
