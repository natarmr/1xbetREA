package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ik1 implements jk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f14903a;

    public ik1(mdm mdmVar) {
        mdmVar.getClass();
        this.f14903a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ik1) && Intrinsics.d(this.f14903a, ((ik1) obj).f14903a);
    }

    public final int hashCode() {
        return this.f14903a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f14903a, Separators.RPAREN);
    }
}
