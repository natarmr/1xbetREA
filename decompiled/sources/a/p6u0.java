package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class p6u0 implements q6u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26475a;
    public final long b;
    public final String c;
    public final String d;
    public final v12 e;

    public p6u0(String str, long j, String str2, String str3, v12 v12Var) {
        str3.getClass();
        this.f26475a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = v12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6u0)) {
            return false;
        }
        p6u0 p6u0Var = (p6u0) obj;
        return this.f26475a.equals(p6u0Var.f26475a) && this.b == p6u0Var.b && this.c.equals(p6u0Var.c) && Intrinsics.d(this.d, p6u0Var.d) && this.e == p6u0Var.e;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.f26475a;
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(R.drawable.ic_glyph_map_pin, ua80.b(ua80.b(rw2.b(this.f26475a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "VenueCellLUiModel(key=", this.f26475a, ", id=");
        f140.v(sbO, ", name=", this.c, ", info=", this.d);
        sbO.append(", icon=");
        sbO.append(R.drawable.ic_glyph_map_pin);
        sbO.append(", alignmentInSection=");
        sbO.append(this.e);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
