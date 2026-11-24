package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class deh0 implements ieh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5951a;

    public final boolean equals(Object obj) {
        if (obj instanceof deh0) {
            return Intrinsics.d(this.f5951a, ((deh0) obj).f5951a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5951a.hashCode();
    }

    public final String toString() {
        return kng0.l("PlayerTwoName(value=", this.f5951a, Separators.RPAREN);
    }
}
