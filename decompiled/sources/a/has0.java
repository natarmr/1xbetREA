package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class has0 implements jas0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f12740a;

    public has0(mdm mdmVar) {
        mdmVar.getClass();
        this.f12740a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof has0) && Intrinsics.d(this.f12740a, ((has0) obj).f12740a);
    }

    public final int hashCode() {
        return this.f12740a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f12740a, Separators.RPAREN);
    }
}
