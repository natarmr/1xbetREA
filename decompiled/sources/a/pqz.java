package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class pqz implements tqz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27439a;
    public final String b;

    public pqz(int i, String str) {
        str.getClass();
        this.f27439a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqz)) {
            return false;
        }
        pqz pqzVar = (pqz) obj;
        return this.f27439a == pqzVar.f27439a && Intrinsics.d(this.b, pqzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f27439a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f27439a, "OnChangeLimitConfirmed(limitValue=", ", limitMeasure=", this.b, Separators.RPAREN);
    }
}
