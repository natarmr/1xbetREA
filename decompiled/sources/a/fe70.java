package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fe70 implements ge70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f9392a;

    public fe70(mdm mdmVar) {
        mdmVar.getClass();
        this.f9392a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe70) && Intrinsics.d(this.f9392a, ((fe70) obj).f9392a);
    }

    public final int hashCode() {
        return this.f9392a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f9392a, Separators.RPAREN);
    }
}
