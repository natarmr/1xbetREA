package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wcc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38918a;
    public final int b;
    public final String c;
    public final String d;

    public wcc0(String str, int i, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f38918a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcc0)) {
            return false;
        }
        wcc0 wcc0Var = (wcc0) obj;
        return Intrinsics.d(this.f38918a, wcc0Var.f38918a) && this.b == wcc0Var.b && Intrinsics.d(this.c, wcc0Var.c) && Intrinsics.d(this.d, wcc0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(twn.a(this.b, this.f38918a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return ua80.m(kng0.p(this.b, "PromoCodeConditionModel(stateKey=", this.f38918a, ", stateKeyType=", ", stateName="), this.c, ", stateValue=", this.d, Separators.RPAREN);
    }
}
