package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j870 implements p870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qhr f16070a;

    static {
        phr phrVar = qhr.Companion;
    }

    public j870(qhr qhrVar) {
        qhrVar.getClass();
        this.f16070a = qhrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j870) && Intrinsics.d(this.f16070a, ((j870) obj).f16070a);
    }

    public final int hashCode() {
        return this.f16070a.hashCode();
    }

    public final String toString() {
        return "OnSetUserAccountBalance(event=" + this.f16070a + Separators.RPAREN;
    }
}
