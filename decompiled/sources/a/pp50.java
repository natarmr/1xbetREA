package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pp50 implements rp50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f27361a;

    public pp50(mdm mdmVar) {
        mdmVar.getClass();
        this.f27361a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pp50) && Intrinsics.d(this.f27361a, ((pp50) obj).f27361a);
    }

    public final int hashCode() {
        return this.f27361a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f27361a, Separators.RPAREN);
    }
}
