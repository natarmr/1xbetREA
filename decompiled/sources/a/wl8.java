package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wl8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f39340a;
    public final boolean b;
    public final boolean c;
    public final mdm d;

    public wl8(ArrayList arrayList, boolean z, boolean z2, mdm mdmVar) {
        this.f39340a = arrayList;
        this.b = z;
        this.c = z2;
        this.d = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl8)) {
            return false;
        }
        wl8 wl8Var = (wl8) obj;
        return this.f39340a.equals(wl8Var.f39340a) && this.b == wl8Var.b && this.c == wl8Var.c && Intrinsics.d(this.d, wl8Var.d);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(this.f39340a.hashCode() * 31, 31, this.b), 31, this.c);
        mdm mdmVar = this.d;
        return iE + (mdmVar == null ? 0 : mdmVar.hashCode());
    }

    public final String toString() {
        return "BonusesUiState(bonuses=" + this.f39340a + ", showLoading=" + this.b + ", showEmptyView=" + this.c + ", emptyView=" + this.d + Separators.RPAREN;
    }
}
