package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class x7c0 implements b8c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40407a;

    public x7c0(String str) {
        str.getClass();
        this.f40407a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7c0) && Intrinsics.d(this.f40407a, ((x7c0) obj).f40407a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_glyph_money) + ua80.b(-749194074, 31, this.f40407a);
    }

    public final String toString() {
        return dw9.n(R.drawable.ic_glyph_money, "Inactive(id=CASHBACK, title=", this.f40407a, ", icon=", Separators.RPAREN);
    }
}
