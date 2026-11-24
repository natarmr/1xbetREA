package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wee0 implements yee0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f39014a;

    public wee0(mdm mdmVar) {
        mdmVar.getClass();
        this.f39014a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wee0) && Intrinsics.d(this.f39014a, ((wee0) obj).f39014a);
    }

    public final int hashCode() {
        return this.f39014a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f39014a, Separators.RPAREN);
    }
}
