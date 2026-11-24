package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class msc0 implements qsc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22312a;
    public final String b;

    public msc0(String str, String str2) {
        str.getClass();
        this.f22312a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msc0)) {
            return false;
        }
        msc0 msc0Var = (msc0) obj;
        return Intrinsics.d(this.f22312a, msc0Var.f22312a) && this.b.equals(msc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22312a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowErrorDialog(title=", this.f22312a, ", message=", this.b, Separators.RPAREN);
    }
}
