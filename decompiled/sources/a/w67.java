package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38613a;
    public final String b;

    public w67(String str, String str2) {
        str.getClass();
        this.f38613a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w67)) {
            return false;
        }
        w67 w67Var = (w67) obj;
        return Intrinsics.d(this.f38613a, w67Var.f38613a) && this.b.equals(w67Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38613a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowSaleDialog(betId=", this.f38613a, ", currency=", this.b, Separators.RPAREN);
    }
}
