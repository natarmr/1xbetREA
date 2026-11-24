package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nr90 implements or90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f23990a;

    public nr90(mdm mdmVar) {
        mdmVar.getClass();
        this.f23990a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nr90) && Intrinsics.d(this.f23990a, ((nr90) obj).f23990a);
    }

    public final int hashCode() {
        return this.f23990a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(config=", this.f23990a, Separators.RPAREN);
    }
}
