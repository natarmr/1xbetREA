package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class w7c0 implements b8c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38666a;
    public final String b;

    public w7c0(String str, String str2) {
        str.getClass();
        this.f38666a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7c0)) {
            return false;
        }
        w7c0 w7c0Var = (w7c0) obj;
        return Intrinsics.d(this.f38666a, w7c0Var.f38666a) && this.b.equals(w7c0Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_glyph_money) + ua80.b(ua80.b(-749194074, 31, this.f38666a), 31, this.b);
    }

    public final String toString() {
        return rz4.j(R.drawable.ic_glyph_money, Separators.RPAREN, b1j.n("Amount(id=CASHBACK, title=", this.f38666a, ", amount=", this.b, ", icon="));
    }
}
