package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ayw extends Throwable implements alx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ytg0 f1689a;
    public final String b;

    public ayw(ytg0 ytg0Var, String str) {
        super(str);
        this.f1689a = ytg0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayw)) {
            return false;
        }
        ayw aywVar = (ayw) obj;
        return this.f1689a.equals(aywVar.f1689a) && Intrinsics.d(this.b, aywVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f1689a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "IllegalSaleBetSumException(value=" + this.f1689a + ", error=" + this.b + Separators.RPAREN;
    }
}
