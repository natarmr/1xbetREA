package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xhn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40901a;
    public final cjn b;

    public xhn(String str, cjn cjnVar) {
        str.getClass();
        cjnVar.getClass();
        this.f40901a = str;
        this.b = cjnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhn)) {
            return false;
        }
        xhn xhnVar = (xhn) obj;
        return Intrinsics.d(this.f40901a, xhnVar.f40901a) && Intrinsics.d(this.b, xhnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40901a.hashCode() * 31);
    }

    public final String toString() {
        return "EasternNightsGameScreenStateModel(currentCurrency=" + this.f40901a + ", gameStateModel=" + this.b + Separators.RPAREN;
    }
}
