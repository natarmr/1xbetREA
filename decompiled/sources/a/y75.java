package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y75 implements z75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f42134a;

    public y75(mdm mdmVar) {
        mdmVar.getClass();
        this.f42134a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y75) && Intrinsics.d(this.f42134a, ((y75) obj).f42134a);
    }

    public final int hashCode() {
        return this.f42134a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f42134a, Separators.RPAREN);
    }
}
