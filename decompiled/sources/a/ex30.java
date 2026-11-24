package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ex30 implements kx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8558a;
    public final String b;

    public ex30(String str, byte[] bArr) {
        bArr.getClass();
        this.f8558a = bArr;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex30)) {
            return false;
        }
        ex30 ex30Var = (ex30) obj;
        return Intrinsics.d(this.f8558a, ex30Var.f8558a) && this.b.equals(ex30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Arrays.hashCode(this.f8558a) * 31);
    }

    public final String toString() {
        return b1j.k("Print(bytes=", Arrays.toString(this.f8558a), ", betId=", this.b, Separators.RPAREN);
    }
}
