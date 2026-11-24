package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zu8 implements av8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f44997a;

    public zu8(mdm mdmVar) {
        mdmVar.getClass();
        this.f44997a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu8) && Intrinsics.d(this.f44997a, ((zu8) obj).f44997a);
    }

    public final int hashCode() {
        return this.f44997a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f44997a, Separators.RPAREN);
    }
}
