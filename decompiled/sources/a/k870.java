package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k870 implements p870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thr f17861a;

    static {
        shr shrVar = thr.Companion;
    }

    public k870(thr thrVar) {
        thrVar.getClass();
        this.f17861a = thrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k870) && Intrinsics.d(this.f17861a, ((k870) obj).f17861a);
    }

    public final int hashCode() {
        return this.f17861a.c.hashCode();
    }

    public final String toString() {
        return "OnShowAuthenticationFailed(event=" + this.f17861a + Separators.RPAREN;
    }
}
