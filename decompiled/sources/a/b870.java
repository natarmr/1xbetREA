package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b870 implements p870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dgr f2144a;

    static {
        cgr cgrVar = dgr.Companion;
    }

    public b870(dgr dgrVar) {
        dgrVar.getClass();
        this.f2144a = dgrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b870) && Intrinsics.d(this.f2144a, ((b870) obj).f2144a);
    }

    public final int hashCode() {
        return this.f2144a.c.hashCode();
    }

    public final String toString() {
        return "OnInit(event=" + this.f2144a + Separators.RPAREN;
    }
}
