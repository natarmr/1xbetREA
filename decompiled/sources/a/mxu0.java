package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class mxu0 implements sxu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22576a;
    public final String b;

    public mxu0(String str, String str2) {
        str2.getClass();
        this.f22576a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxu0)) {
            return false;
        }
        mxu0 mxu0Var = (mxu0) obj;
        return this.f22576a.equals(mxu0Var.f22576a) && Intrinsics.d(this.b, mxu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22576a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("OpenSmsDialog(guid=", this.f22576a, ", amount=", this.b, Separators.RPAREN);
    }
}
