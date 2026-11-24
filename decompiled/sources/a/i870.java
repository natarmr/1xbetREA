package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i870 implements p870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final khr f14326a;

    static {
        jhr jhrVar = khr.Companion;
    }

    public i870(khr khrVar) {
        khrVar.getClass();
        this.f14326a = khrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i870) && Intrinsics.d(this.f14326a, ((i870) obj).f14326a);
    }

    public final int hashCode() {
        return this.f14326a.hashCode();
    }

    public final String toString() {
        return "OnSetRoute(event=" + this.f14326a + Separators.RPAREN;
    }
}
