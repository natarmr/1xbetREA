package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class bfg0 implements iqg {
    public static final afg0 Companion = new afg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mfg0 f2501a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ bfg0(int i, mfg0 mfg0Var, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f2501a = null;
        } else {
            this.f2501a = mfg0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfg0)) {
            return false;
        }
        bfg0 bfg0Var = (bfg0) obj;
        return this.f2501a == bfg0Var.f2501a && Intrinsics.d(this.b, bfg0Var.b) && Intrinsics.d(this.c, bfg0Var.c) && Intrinsics.d(this.d, bfg0Var.d);
    }

    public final int hashCode() {
        mfg0 mfg0Var = this.f2501a;
        int iHashCode = (mfg0Var == null ? 0 : mfg0Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouletteResponse(rouletteType=");
        sb.append(this.f2501a);
        sb.append(", animationValue=");
        sb.append(this.b);
        sb.append(", allValuesOfGame=");
        return ua80.m(sb, this.c, ", currentValue=", this.d, Separators.RPAREN);
    }

    public bfg0() {
        this.f2501a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
