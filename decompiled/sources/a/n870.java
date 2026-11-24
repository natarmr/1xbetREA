package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n870 implements p870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cir f23076a;

    static {
        bir birVar = cir.Companion;
    }

    public n870(cir cirVar) {
        cirVar.getClass();
        this.f23076a = cirVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n870) && Intrinsics.d(this.f23076a, ((n870) obj).f23076a);
    }

    public final int hashCode() {
        return this.f23076a.hashCode();
    }

    public final String toString() {
        return "OnShowGameState(event=" + this.f23076a + Separators.RPAREN;
    }
}
