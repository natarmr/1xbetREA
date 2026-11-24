package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lom0 implements mom0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20400a;
    public final String b;

    public lom0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f20400a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lom0)) {
            return false;
        }
        lom0 lom0Var = (lom0) obj;
        return Intrinsics.d(this.f20400a, lom0Var.f20400a) && Intrinsics.d(this.b, lom0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20400a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Result(eventDate=", this.f20400a, ", sabStatus=", this.b, Separators.RPAREN);
    }
}
