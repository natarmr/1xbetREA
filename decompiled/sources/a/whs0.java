package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class whs0 {
    public static final vhs0 Companion = new vhs0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f39181a;
    public final mca0 b;
    public final wmp0 c;
    public final wmp0 d;

    public /* synthetic */ whs0(int i, Long l, mca0 mca0Var, wmp0 wmp0Var, wmp0 wmp0Var2) {
        if ((i & 1) == 0) {
            this.f39181a = null;
        } else {
            this.f39181a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = mca0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = wmp0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = wmp0Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whs0)) {
            return false;
        }
        whs0 whs0Var = (whs0) obj;
        return Intrinsics.d(this.f39181a, whs0Var.f39181a) && Intrinsics.d(this.b, whs0Var.b) && Intrinsics.d(this.c, whs0Var.c) && Intrinsics.d(this.d, whs0Var.d);
    }

    public final int hashCode() {
        Long l = this.f39181a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        mca0 mca0Var = this.b;
        int iHashCode2 = (iHashCode + (mca0Var == null ? 0 : mca0Var.hashCode())) * 31;
        wmp0 wmp0Var = this.c;
        int iHashCode3 = (iHashCode2 + (wmp0Var == null ? 0 : wmp0Var.hashCode())) * 31;
        wmp0 wmp0Var2 = this.d;
        return iHashCode3 + (wmp0Var2 != null ? wmp0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "TransferResponse(dateTimestamp=" + this.f39181a + ", player=" + this.b + ", oldTeam=" + this.c + ", newTeam=" + this.d + Separators.RPAREN;
    }
}
