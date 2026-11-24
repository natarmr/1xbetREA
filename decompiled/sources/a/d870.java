package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d870 implements p870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sgr f5632a;

    static {
        rgr rgrVar = sgr.Companion;
    }

    public d870(sgr sgrVar) {
        sgrVar.getClass();
        this.f5632a = sgrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d870) && Intrinsics.d(this.f5632a, ((d870) obj).f5632a);
    }

    public final int hashCode() {
        return this.f5632a.hashCode();
    }

    public final String toString() {
        return "OnSetDemoStatus(event=" + this.f5632a + Separators.RPAREN;
    }
}
