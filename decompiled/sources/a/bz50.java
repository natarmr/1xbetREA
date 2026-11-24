package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bz50 implements jz50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tdp f3450a;
    public final String b;

    public bz50(tdp tdpVar, String str) {
        tdpVar.getClass();
        this.f3450a = tdpVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz50)) {
            return false;
        }
        bz50 bz50Var = (bz50) obj;
        return Intrinsics.d(this.f3450a, bz50Var.f3450a) && Intrinsics.d(this.b, bz50Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f3450a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OnCardClick(model=" + this.f3450a + ", loadedImageUrl=" + this.b + Separators.RPAREN;
    }
}
