package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.presentation.rules.VirtualSportRulesParams;

/* JADX INFO: loaded from: classes4.dex */
public final class wtu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39761a;
    public final VirtualSportRulesParams b;
    public final long c;
    public final j0g0 d;

    public wtu0(boolean z, VirtualSportRulesParams virtualSportRulesParams, long j, j0g0 j0g0Var) {
        this.f39761a = z;
        this.b = virtualSportRulesParams;
        this.c = j;
        this.d = j0g0Var;
    }

    public static wtu0 a(wtu0 wtu0Var, boolean z, long j, j0g0 j0g0Var, int i) {
        if ((i & 1) != 0) {
            z = wtu0Var.f39761a;
        }
        boolean z2 = z;
        VirtualSportRulesParams virtualSportRulesParams = wtu0Var.b;
        if ((i & 4) != 0) {
            j = wtu0Var.c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            j0g0Var = wtu0Var.d;
        }
        wtu0Var.getClass();
        return new wtu0(z2, virtualSportRulesParams, j2, j0g0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtu0)) {
            return false;
        }
        wtu0 wtu0Var = (wtu0) obj;
        return this.f39761a == wtu0Var.f39761a && this.b.equals(wtu0Var.b) && this.c == wtu0Var.c && Intrinsics.d(this.d, wtu0Var.d);
    }

    public final int hashCode() {
        int iB = rw2.b((this.b.hashCode() + (Boolean.hashCode(this.f39761a) * 31)) * 31, 31, this.c);
        j0g0 j0g0Var = this.d;
        return iB + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a));
    }

    public final String toString() {
        return "VirtualSportRulesStateModel(connected=" + this.f39761a + ", params=" + this.b + ", selectedTabId=" + this.c + ", sections=" + this.d + Separators.RPAREN;
    }
}
