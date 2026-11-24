package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cmr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dmr f4620a;
    public final String b;

    public cmr(dmr dmrVar, String str) {
        str.getClass();
        this.f4620a = dmrVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmr)) {
            return false;
        }
        cmr cmrVar = (cmr) obj;
        return this.f4620a == cmrVar.f4620a && Intrinsics.d(this.b, cmrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4620a.hashCode() * 31);
    }

    public final String toString() {
        return "GameAddTime(keyInfo=" + this.f4620a + ", valueInfo=" + this.b + Separators.RPAREN;
    }
}
