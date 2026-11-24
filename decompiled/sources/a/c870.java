package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c870 implements p870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ggr f3900a;

    static {
        fgr fgrVar = ggr.Companion;
    }

    public c870(ggr ggrVar) {
        ggrVar.getClass();
        this.f3900a = ggrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c870) && Intrinsics.d(this.f3900a, ((c870) obj).f3900a);
    }

    public final int hashCode() {
        return this.f3900a.c.hashCode();
    }

    public final String toString() {
        return "OnRefreshPage(event=" + this.f3900a + Separators.RPAREN;
    }
}
