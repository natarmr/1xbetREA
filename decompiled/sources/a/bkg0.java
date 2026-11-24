package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bkg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2745a;
    public final a4x b;

    public bkg0(a4x a4xVar, String str) {
        str.getClass();
        a4xVar.getClass();
        this.f2745a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkg0)) {
            return false;
        }
        bkg0 bkg0Var = (bkg0) obj;
        return Intrinsics.d(this.f2745a, bkg0Var.f2745a) && Intrinsics.d(this.b, bkg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2745a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("RpsResultColumnUiModel(header=", this.f2745a, ", rounds=", this.b, Separators.RPAREN);
    }
}
