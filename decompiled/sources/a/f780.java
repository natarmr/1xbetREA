package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f780 implements p780 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9048a;

    public final boolean equals(Object obj) {
        if (obj instanceof f780) {
            return Intrinsics.d(this.f9048a, ((f780) obj).f9048a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9048a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnChangeMessage(value=", this.f9048a, Separators.RPAREN);
    }
}
