package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ji1 implements li1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f16554a;

    public ji1(mdm mdmVar) {
        mdmVar.getClass();
        this.f16554a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ji1) && Intrinsics.d(this.f16554a, ((ji1) obj).f16554a);
    }

    public final int hashCode() {
        return this.f16554a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f16554a, Separators.RPAREN);
    }
}
