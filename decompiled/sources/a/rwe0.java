package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rwe0 implements twe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f31214a;

    public rwe0(mdm mdmVar) {
        mdmVar.getClass();
        this.f31214a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwe0) && Intrinsics.d(this.f31214a, ((rwe0) obj).f31214a);
    }

    public final int hashCode() {
        return this.f31214a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f31214a, Separators.RPAREN);
    }
}
