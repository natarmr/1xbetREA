package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bv80 implements cv80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f3268a;

    public bv80(mdm mdmVar) {
        mdmVar.getClass();
        this.f3268a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bv80) && Intrinsics.d(this.f3268a, ((bv80) obj).f3268a);
    }

    public final int hashCode() {
        return this.f3268a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f3268a, Separators.RPAREN);
    }
}
