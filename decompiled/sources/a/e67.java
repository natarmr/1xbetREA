package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7267a;
    public final String b;

    public e67(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f7267a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e67)) {
            return false;
        }
        e67 e67Var = (e67) obj;
        return Intrinsics.d(this.f7267a, e67Var.f7267a) && Intrinsics.d(this.b, e67Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7267a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Copy(betIdNumber=", this.f7267a, ", copy=", this.b, Separators.RPAREN);
    }
}
