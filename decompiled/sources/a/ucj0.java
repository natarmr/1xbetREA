package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ucj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35433a;
    public final zsv b;
    public final vg c;
    public final a4x d;
    public final boolean e;
    public final aoo0 f;

    public ucj0(boolean z, zsv zsvVar, vg vgVar, a4x a4xVar, boolean z2, aoo0 aoo0Var) {
        a4xVar.getClass();
        this.f35433a = z;
        this.b = zsvVar;
        this.c = vgVar;
        this.d = a4xVar;
        this.e = z2;
        this.f = aoo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucj0)) {
            return false;
        }
        ucj0 ucj0Var = (ucj0) obj;
        return this.f35433a == ucj0Var.f35433a && this.b.equals(ucj0Var.b) && this.c.equals(ucj0Var.c) && Intrinsics.d(this.d, ucj0Var.d) && this.e == ucj0Var.e && this.f == ucj0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(cs0.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f35433a) * 31)) * 31)) * 31, 31), 31, this.e);
    }

    public final String toString() {
        return "SettingsTabsUiState(rtl=" + this.f35433a + ", headerState=" + this.b + ", accountState=" + this.c + ", settingsUiModelList=" + this.d + ", lastConnection=" + this.e + ", tabsStyle=" + this.f + Separators.RPAREN;
    }
}
