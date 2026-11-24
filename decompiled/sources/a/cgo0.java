package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cgo0 implements ego0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4323a;
    public final sek0 b;

    public cgo0(sek0 sek0Var, String str) {
        str.getClass();
        this.f4323a = str;
        this.b = sek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgo0)) {
            return false;
        }
        cgo0 cgo0Var = (cgo0) obj;
        return Intrinsics.d(this.f4323a, cgo0Var.f4323a) && this.b.equals(cgo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4323a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMessage(message=" + this.f4323a + ", type=" + this.b + Separators.RPAREN;
    }
}
