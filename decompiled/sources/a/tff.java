package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tff extends uff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lgf f33861a;
    public final String b;

    public tff(lgf lgfVar, String str) {
        lgfVar.getClass();
        str.getClass();
        this.f33861a = lgfVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tff)) {
            return false;
        }
        tff tffVar = (tff) obj;
        return Intrinsics.d(this.f33861a, tffVar.f33861a) && Intrinsics.d(this.b, tffVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33861a.hashCode() * 31);
    }

    public final String toString() {
        return "StartGame(gameModel=" + this.f33861a + ", currencySymbol=" + this.b + Separators.RPAREN;
    }
}
