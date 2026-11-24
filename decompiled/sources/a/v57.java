package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v57 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36815a;

    public final boolean equals(Object obj) {
        if (obj instanceof v57) {
            return Intrinsics.d(this.f36815a, ((v57) obj).f36815a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36815a.hashCode();
    }

    public final String toString() {
        return kng0.l("AutoBetCanceledConfirm(betId=", this.f36815a, Separators.RPAREN);
    }
}
