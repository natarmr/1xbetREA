package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class eq0 implements gq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f8210a;

    public eq0(mdm mdmVar) {
        mdmVar.getClass();
        this.f8210a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq0) && Intrinsics.d(this.f8210a, ((eq0) obj).f8210a);
    }

    public final int hashCode() {
        return this.f8210a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f8210a, Separators.RPAREN);
    }
}
