package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m0b0 implements n0b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f20946a;

    public m0b0(mdm mdmVar) {
        mdmVar.getClass();
        this.f20946a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0b0) && Intrinsics.d(this.f20946a, ((m0b0) obj).f20946a);
    }

    public final int hashCode() {
        return this.f20946a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f20946a, Separators.RPAREN);
    }
}
