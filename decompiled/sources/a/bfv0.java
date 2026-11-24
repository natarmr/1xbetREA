package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bfv0 implements dfv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wim f2524a;
    public final String b;

    public bfv0(wim wimVar, String str) {
        this.f2524a = wimVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfv0)) {
            return false;
        }
        bfv0 bfv0Var = (bfv0) obj;
        return this.f2524a.equals(bfv0Var.f2524a) && Intrinsics.d(this.b, bfv0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f2524a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OnGameClick(game=" + this.f2524a + ", loadedImageUrl=" + this.b + Separators.RPAREN;
    }
}
