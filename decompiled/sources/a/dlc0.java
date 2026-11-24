package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dlc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final toe f6273a;
    public final toe b;
    public final hl c;

    public dlc0(toe toeVar, toe toeVar2, hl hlVar) {
        toeVar.getClass();
        toeVar2.getClass();
        hlVar.getClass();
        this.f6273a = toeVar;
        this.b = toeVar2;
        this.c = hlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlc0)) {
            return false;
        }
        dlc0 dlc0Var = (dlc0) obj;
        return Intrinsics.d(this.f6273a, dlc0Var.f6273a) && Intrinsics.d(this.b, dlc0Var.b) && Intrinsics.d(this.c, dlc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b.f34280a, Integer.hashCode(this.f6273a.f34280a) * 31, 31);
    }

    public final String toString() {
        return "PromoGiftsModel(bonuses=" + this.f6273a + ", freeSpins=" + this.b + ", activeBonus=" + this.c + Separators.RPAREN;
    }
}
