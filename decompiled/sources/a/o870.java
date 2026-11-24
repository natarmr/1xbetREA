package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o870 implements p870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fir f24818a;

    static {
        eir eirVar = fir.Companion;
    }

    public o870(fir firVar) {
        firVar.getClass();
        this.f24818a = firVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o870) && Intrinsics.d(this.f24818a, ((o870) obj).f24818a);
    }

    public final int hashCode() {
        return this.f24818a.c.hashCode();
    }

    public final String toString() {
        return "OnSuggestRefreshPage(event=" + this.f24818a + Separators.RPAREN;
    }
}
