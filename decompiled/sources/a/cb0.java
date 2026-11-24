package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cb0 implements fb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4039a;
    public final String b;

    public cb0(String str, String str2) {
        str.getClass();
        this.f4039a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb0)) {
            return false;
        }
        cb0 cb0Var = (cb0) obj;
        return Intrinsics.d(this.f4039a, cb0Var.f4039a) && this.b.equals(cb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4039a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("OnAccountClick(screenName=", this.f4039a, ", screenKey=", this.b, Separators.RPAREN);
    }
}
