package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zw30 implements kx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45088a;
    public final String b;

    public zw30(String str, String str2) {
        str.getClass();
        this.f45088a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw30)) {
            return false;
        }
        zw30 zw30Var = (zw30) obj;
        return Intrinsics.d(this.f45088a, zw30Var.f45088a) && this.b.equals(zw30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f45088a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Copy(betIdNumber=", this.f45088a, ", betId=", this.b, Separators.RPAREN);
    }
}
