package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l870 implements p870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whr f19593a;

    static {
        vhr vhrVar = whr.Companion;
    }

    public l870(whr whrVar) {
        whrVar.getClass();
        this.f19593a = whrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l870) && Intrinsics.d(this.f19593a, ((l870) obj).f19593a);
    }

    public final int hashCode() {
        return this.f19593a.c.hashCode();
    }

    public final String toString() {
        return "OnShowAuthenticationRequired(event=" + this.f19593a + Separators.RPAREN;
    }
}
