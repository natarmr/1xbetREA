package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pv8 implements rv8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f27651a;

    public pv8(mdm mdmVar) {
        mdmVar.getClass();
        this.f27651a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pv8) && Intrinsics.d(this.f27651a, ((pv8) obj).f27651a);
    }

    public final int hashCode() {
        return this.f27651a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f27651a, Separators.RPAREN);
    }
}
