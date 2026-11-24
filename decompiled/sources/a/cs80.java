package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cs80 implements es80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f4876a;

    public cs80(mdm mdmVar) {
        mdmVar.getClass();
        this.f4876a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cs80) && Intrinsics.d(this.f4876a, ((cs80) obj).f4876a);
    }

    public final int hashCode() {
        return this.f4876a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(emptyConfig=", this.f4876a, Separators.RPAREN);
    }
}
