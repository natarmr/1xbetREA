package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h870 implements p870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hhr f12614a;

    static {
        ghr ghrVar = hhr.Companion;
    }

    public h870(hhr hhrVar) {
        hhrVar.getClass();
        this.f12614a = hhrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h870) && Intrinsics.d(this.f12614a, ((h870) obj).f12614a);
    }

    public final int hashCode() {
        return this.f12614a.hashCode();
    }

    public final String toString() {
        return "OnSetPageTitle(event=" + this.f12614a + Separators.RPAREN;
    }
}
