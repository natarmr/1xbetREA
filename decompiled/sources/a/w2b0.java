package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w2b0 implements x2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f38439a;

    public w2b0(mdm mdmVar) {
        mdmVar.getClass();
        this.f38439a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2b0) && Intrinsics.d(this.f38439a, ((w2b0) obj).f38439a);
    }

    public final int hashCode() {
        return this.f38439a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f38439a, Separators.RPAREN);
    }
}
