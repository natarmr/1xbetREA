package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class kic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18329a;
    public final a4x b;

    public kic(a4x a4xVar, String str) {
        str.getClass();
        a4xVar.getClass();
        this.f18329a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kic)) {
            return false;
        }
        kic kicVar = (kic) obj;
        return Intrinsics.d(this.f18329a, kicVar.f18329a) && Intrinsics.d(this.b, kicVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18329a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("ChooseSubGameUiState(title=", this.f18329a, ", subGames=", this.b, Separators.RPAREN);
    }
}
