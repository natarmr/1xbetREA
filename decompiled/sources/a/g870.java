package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g870 implements p870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ehr f10852a;

    static {
        dhr dhrVar = ehr.Companion;
    }

    public g870(ehr ehrVar) {
        ehrVar.getClass();
        this.f10852a = ehrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g870) && Intrinsics.d(this.f10852a, ((g870) obj).f10852a);
    }

    public final int hashCode() {
        return this.f10852a.c.hashCode();
    }

    public final String toString() {
        return "OnSetPageLoaded(event=" + this.f10852a + Separators.RPAREN;
    }
}
