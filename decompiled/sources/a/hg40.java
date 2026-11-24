package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hg40 implements ig40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nte0 f13002a;

    public hg40(nte0 nte0Var) {
        nte0Var.getClass();
        this.f13002a = nte0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hg40) && Intrinsics.d(this.f13002a, ((hg40) obj).f13002a);
    }

    public final int hashCode() {
        return this.f13002a.hashCode();
    }

    public final String toString() {
        return "ResendSmsTimer(registerSendSmsModel=" + this.f13002a + Separators.RPAREN;
    }
}
