package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class et6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8361a;
    public final a4x b;

    public et6(a4x a4xVar, String str) {
        a4xVar.getClass();
        this.f8361a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et6)) {
            return false;
        }
        et6 et6Var = (et6) obj;
        return this.f8361a.equals(et6Var.f8361a) && Intrinsics.d(this.b, et6Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + cs0.b(this.b, this.f8361a.hashCode() * 31, 31);
    }

    public final String toString() {
        return f140.m("BetConstructorMarketRowUiModel(key=", this.f8361a, ", marketModelList=", this.b, ", rtlSupport=false)");
    }
}
