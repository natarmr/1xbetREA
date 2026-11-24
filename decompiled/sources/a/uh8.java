package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uh8 implements ci8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csr f35665a;
    public final String b;

    public uh8(csr csrVar, String str) {
        csrVar.getClass();
        this.f35665a = csrVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh8)) {
            return false;
        }
        uh8 uh8Var = (uh8) obj;
        return Intrinsics.d(this.f35665a, uh8Var.f35665a) && Intrinsics.d(this.b, uh8Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f35665a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OnBonusClick(bonus=" + this.f35665a + ", loadedPictureUrl=" + this.b + Separators.RPAREN;
    }
}
