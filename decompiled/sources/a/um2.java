package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class um2 implements vm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nxy f35900a;
    public final String b;

    public um2(nxy nxyVar, String str) {
        nxyVar.getClass();
        this.f35900a = nxyVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um2)) {
            return false;
        }
        um2 um2Var = (um2) obj;
        return Intrinsics.d(this.f35900a, um2Var.f35900a) && Intrinsics.d(this.b, um2Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f35900a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "XGameClicked(value=" + this.f35900a + ", loadedPictureUrl=" + this.b + Separators.RPAREN;
    }
}
