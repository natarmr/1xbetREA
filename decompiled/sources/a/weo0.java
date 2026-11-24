package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class weo0 implements xeo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f39028a;

    public weo0(mdm mdmVar) {
        mdmVar.getClass();
        this.f39028a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof weo0) && Intrinsics.d(this.f39028a, ((weo0) obj).f39028a);
    }

    public final int hashCode() {
        return this.f39028a.hashCode();
    }

    public final String toString() {
        return b1j.j("SearchEmpty(config=", this.f39028a, Separators.RPAREN);
    }
}
