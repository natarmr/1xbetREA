package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o4c0 implements hvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24627a;
    public final String b;
    public final n0x c;
    public final Function2 d;
    public final Function1 e;

    public o4c0(long j, String str, n0x n0xVar) {
        j3b0 j3b0Var = new j3b0((byte) 29);
        ljc0 ljc0Var = new ljc0((byte) 14);
        str.getClass();
        this.f24627a = j;
        this.b = str;
        this.c = n0xVar;
        this.d = j3b0Var;
        this.e = ljc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4c0)) {
            return false;
        }
        o4c0 o4c0Var = (o4c0) obj;
        return this.f24627a == o4c0Var.f24627a && Intrinsics.d(this.b, o4c0Var.b) && this.c.equals(o4c0Var.c) && this.d.equals(o4c0Var.d) && this.e.equals(o4c0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + brm0.e(f140.f(this.c, ua80.b(Long.hashCode(this.f24627a) * 31, 31, this.b), 31), 31, false)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f24627a, "PromoAdditionalItemModel(promoId=", ", label=", this.b);
        sbO.append(", picture=");
        sbO.append(this.c);
        sbO.append(", gradientEnabled=false, onLoaded=");
        sbO.append(this.d);
        sbO.append(", onError=");
        sbO.append(this.e);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
