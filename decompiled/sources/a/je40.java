package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class je40 implements le40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f16356a;

    public je40(mdm mdmVar) {
        mdmVar.getClass();
        this.f16356a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof je40) && Intrinsics.d(this.f16356a, ((je40) obj).f16356a);
    }

    public final int hashCode() {
        return this.f16356a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f16356a, Separators.RPAREN);
    }
}
